package lv.javaguru.java3.core.commands.JiraIssues;

/**
 * Created by Viesturs on 12-Nov-16.
 */
import lv.javaguru.java3.core.commands.DomainCommand;


public class GetJiraIssueCommand implements DomainCommand<GetJiraIssueResult> {

    private Long issue_id;

    public GetJiraIssueCommand(Long ISSUE_ID) {
        this.issue_id = ISSUE_ID;
    }

    public Long getJiraIssueID() {
        return issue_id;
    }

}
