package lv.javaguru.java3.integrations.rest.dto;

import lv.javaguru.java3.core.domain.JiraIssue;

import java.io.Serializable;
import java.util.List;

public class ClientDTO implements Serializable {

    private Long client_id;
    private String login;
    private String password;
    private List<JiraIssue> issues;


    public Long getId() {
        return client_id;
    }

    public void setId(Long id) {
        this.client_id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<JiraIssue> getIssues() {
        return issues;
    }

    public void setIssues(List<JiraIssue> jiraIssues) {
        this.issues = jiraIssues;
    }


    @Override
    public String toString() {
        return "Client{" +
                "login = " + login + '\'' +
                ", password = " + password +
                ", id = " + client_id +
                ", issues = " + issues +
                '}';
    }



}
