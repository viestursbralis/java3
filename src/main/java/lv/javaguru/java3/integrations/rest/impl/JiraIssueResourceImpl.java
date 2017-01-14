package lv.javaguru.java3.integrations.rest.impl;

import lv.javaguru.java3.core.commands.JiraIssues.CreateJiraIssueCommand;
import lv.javaguru.java3.core.commands.JiraIssues.CreateJiraIssueResult;
import lv.javaguru.java3.core.commands.JiraIssues.GetJiraIssueCommand;
import lv.javaguru.java3.core.commands.JiraIssues.GetJiraIssueResult;
import lv.javaguru.java3.core.services.CommandExecutor;
import lv.javaguru.java3.integrations.rest.api.JiraIssueResource;
import lv.javaguru.java3.integrations.rest.api.RESTResource;
import lv.javaguru.java3.integrations.rest.dto.JiraIssueDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

/**
 * Created by Viesturs on 06-Nov-16.
 */
@Component
@Path(RESTResource.API_PATH)
public class JiraIssueResourceImpl implements JiraIssueResource {

    private CommandExecutor commandExecutor;

    @Autowired
    public JiraIssueResourceImpl(CommandExecutor commandExecutor) {
        this.commandExecutor = commandExecutor;
    }

    @POST
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/issues")
    public JiraIssueDTO create(JiraIssueDTO jiraIssueDTO) {
        CreateJiraIssueCommand command = new CreateJiraIssueCommand(
                jiraIssueDTO.getDescription()
                , jiraIssueDTO.getCategory()
                ,jiraIssueDTO.getClient()
        );
        CreateJiraIssueResult result = commandExecutor.execute(command);
        return result.getJiraIssue();
    }

    @GET
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/issues/{issueId}")
    public JiraIssueDTO get(@PathParam("issueId") Long issueId) {
        GetJiraIssueCommand command = new GetJiraIssueCommand(issueId);
        GetJiraIssueResult result = commandExecutor.execute(command);
        return result.getJiraIssue();
    }

    @GET
    @Path("/issues/giveittome")
    public String get() {

        return "Catch!";
    }



}

