package lv.javaguru.java3.integrations.rest.impl;

import lv.javaguru.java3.core.commands.clients.CreateClientCommand;
import lv.javaguru.java3.core.commands.clients.CreateClientResult;
import lv.javaguru.java3.core.commands.clients.GetClientCommand;
import lv.javaguru.java3.core.commands.clients.GetClientResult;
import lv.javaguru.java3.core.domain.Client;
import lv.javaguru.java3.core.services.clients.CustomMessageSender;
import lv.javaguru.java3.integrations.rest.dto.ClientDTO;
import lv.javaguru.java3.core.services.CommandExecutor;
import lv.javaguru.java3.integrations.rest.api.RESTResource;
import lv.javaguru.java3.integrations.rest.api.ClientResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Component
@Path(RESTResource.API_PATH)
public class ClientResourceImpl implements ClientResource {

    private CommandExecutor commandExecutor;
    @Autowired
    private CustomMessageSender sender;

    @Autowired
    public ClientResourceImpl(CommandExecutor commandExecutor) {
        this.commandExecutor = commandExecutor;

    }




    @POST
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/clients")
    public ClientDTO create(ClientDTO clientDTO) {
        CreateClientCommand command = new CreateClientCommand(
                clientDTO.getLogin(), clientDTO.getPassword(), clientDTO.getIssues());


        CreateClientResult result = commandExecutor.execute(command);
        ClientDTO returnClient = result.getClient();
        sender.sendMessage(returnClient);

        return returnClient;//acīmredzot šeit kā return value ir Client DTO, kurš uzreiz tiek izvadīts konsolē;
        //starp return un izvadīšanu konsolē vajag ielikt jms servisu; jeb pirms return vajag ievietot ko līdzīgu Client DTO resultClient = resultClient;
        //pēc tam vērtība result
    }

    @GET
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/clients/{clientId}")
    public ClientDTO get(@PathParam("clientId") Long clientId) {
        GetClientCommand command = new GetClientCommand(clientId);
        GetClientResult result = commandExecutor.execute(command);
        ClientDTO returnClient = result.getClient();
        sender.sendMessage(returnClient);

        return returnClient;
    }

    @GET

    @Path("/giveittome")
    public String get() {

        return "Catch!";
    }



}
