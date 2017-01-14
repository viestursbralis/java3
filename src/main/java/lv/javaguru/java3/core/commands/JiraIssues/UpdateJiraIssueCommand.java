package lv.javaguru.java3.core.commands.JiraIssues;

import lv.javaguru.java3.core.commands.DomainCommand;
import lv.javaguru.java3.core.domain.Category;

/**
 * Created by Viesturs on 12-Nov-16.
 */
public class UpdateJiraIssueCommand implements DomainCommand<UpdateJiraIssueResult> {

    private Long ISSUE_ID;

    private String description;
    private Category category;


    public UpdateJiraIssueCommand(Long ISSUE_ID,
                               String description,
                               Category category) {
        this.ISSUE_ID = ISSUE_ID;
        this.description = description;
        this.category = category;
    }

    public Long getIssueId() {
        return ISSUE_ID;
    }

    public String getDescription() {
        return description;
    }

    public Category getCategory() {
        return category;
    }

}
