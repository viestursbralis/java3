package lv.javaguru.java3.core.commands.JiraIssues;

import lv.javaguru.java3.core.commands.DomainCommandResult;
import lv.javaguru.java3.integrations.rest.dto.JiraIssueDTO;

/**
 * Created by Viesturs on 06-Nov-16.
 */
public class CreateJiraIssueResult implements DomainCommandResult {

    private JiraIssueDTO issue;

    public CreateJiraIssueResult(JiraIssueDTO jiraIssue) {
        this.issue = jiraIssue;
    }

    public JiraIssueDTO getJiraIssue() {
        return issue;
    }

}
