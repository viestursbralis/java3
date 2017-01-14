package lv.javaguru.java3.core.commands.clients;

import lv.javaguru.java3.core.commands.DomainCommand;
import lv.javaguru.java3.core.domain.JiraIssue;

import java.util.List;

public class UpdateClientCommand implements DomainCommand<UpdateClientResult> {

    private Long clientId;

    private String login;
    private String password;
    private List<JiraIssue> issues;


    public UpdateClientCommand(Long clientId,
                               String login,
                               String password,
                               List<JiraIssue> jiraIssues) {
        this.clientId = clientId;
        this.login = login;
        this.password = password;
        this.issues = jiraIssues;
    }

    public Long getClientId() {
        return clientId;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public List<JiraIssue> getJiraIssues(){return issues; }
}
