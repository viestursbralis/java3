package lv.javaguru.java3.integrations.rest.dto;

import lv.javaguru.java3.core.domain.JiraIssue;

import java.util.List;

public class ClientDTOBuilder {

    private Long client_id;
    private String login;
    private String password;
private List<JiraIssue> issues;

    private ClientDTOBuilder() {

    }

    public static ClientDTOBuilder createClientDTO() {
        return new ClientDTOBuilder();
    }

    public ClientDTO build() {
        ClientDTO client = new ClientDTO();
        client.setId(client_id);
        client.setLogin(login);
        client.setPassword(password);
        client.setIssues(issues);
        return client;
    }

    public ClientDTOBuilder withId(Long id) {
        this.client_id = id;
        return this;
    }

    public ClientDTOBuilder withLogin(String login) {
        this.login = login;
        return this;
    }

    public ClientDTOBuilder withPassword(String password) {
        this.password = password;
        return this;
    }

    public ClientDTOBuilder withIssues(List<JiraIssue> issues) {
        this.issues = issues;
        return this;
    }


}
