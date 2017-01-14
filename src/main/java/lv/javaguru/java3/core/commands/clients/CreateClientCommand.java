package lv.javaguru.java3.core.commands.clients;

import lv.javaguru.java3.core.commands.DomainCommand;
import lv.javaguru.java3.core.domain.JiraIssue;

import java.util.List;

public class CreateClientCommand implements DomainCommand<CreateClientResult> {

    private String login;
    private String password;
    private List<JiraIssue> issues;


    public CreateClientCommand(String login,
                               String password, List<JiraIssue> jiraIssues) {
        this.login = login;
        this.password = password;
        this.issues = jiraIssues;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public List<JiraIssue> getJiraIssues(){return issues; }
}
