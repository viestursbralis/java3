package lv.javaguru.java3.core.domain;

import java.util.List;

public class ClientBuilder {

    private Long client_id;
    private String login;
    private String password;
    private List<JiraIssue> issues;


    private ClientBuilder() {

    }

    public static ClientBuilder createClient() {
        return new ClientBuilder();
    }

    public Client build() {
        Client client = new Client();
        client.setId(client_id);
        client.setLogin(login);
        client.setPassword(password);
        client.setIssues(issues);
        return client;
    }

    public ClientBuilder withId(Long id) {
        this.client_id = id;
        return this;
    }

    public ClientBuilder withLogin(String login) {
        this.login = login;
        return this;
    }

    public ClientBuilder withPassword(String password) {
        this.password = password;
        return this;
    }

    public ClientBuilder withIssues(List<JiraIssue> issues) {
        this.issues = issues;
        return this;
    }



}
