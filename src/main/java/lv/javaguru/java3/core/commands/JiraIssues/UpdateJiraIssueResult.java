package lv.javaguru.java3.core.commands.JiraIssues;

import lv.javaguru.java3.core.commands.DomainCommandResult;
import lv.javaguru.java3.integrations.rest.dto.JiraIssueDTO;

/**
 * Created by Viesturs on 12-Nov-16.
 */
public class UpdateJiraIssueResult implements DomainCommandResult {

    private JiraIssueDTO jiraIssue;

    public UpdateJiraIssueResult(JiraIssueDTO jiraIssue) {
        this.jiraIssue = jiraIssue;
    }

    public JiraIssueDTO getJiraIssue() {
        return jiraIssue;
    }

}
