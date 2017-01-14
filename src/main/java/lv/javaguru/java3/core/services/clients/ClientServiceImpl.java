package lv.javaguru.java3.core.services.clients;

import lv.javaguru.java3.core.database.ClientDAO;
import lv.javaguru.java3.core.domain.Client;
import lv.javaguru.java3.core.domain.JiraIssue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
class ClientServiceImpl implements ClientService {

    @Autowired private ClientDAO clientDAO;
    @Autowired private ClientValidator clientValidator;


    @Override
    public Client update(Long clientId,
                         String newLogin,
                         String newPassword,
                         List<JiraIssue> issues) {
        clientValidator.validate(newLogin, newPassword);
        Client client = get(clientId);
        client.setLogin(newLogin);
        client.setPassword(newPassword);
        client.setIssues(issues);
        return client;
    }

    @Override
    public Client get(Long clientId) {
        return clientDAO.getRequired(clientId);
    }

}
