package lv.javaguru.java3.integrations.rest.dto;

import lv.javaguru.java3.core.domain.Category;
import lv.javaguru.java3.core.domain.Client;

/**
 * Created by Viesturs on 06-Nov-16.
 */
public class JiraIssueDTOBuilder {

    private Long issue_id;
    private String description;
    private Client client;
    private Category category;


    private JiraIssueDTOBuilder() {

    }

    public static JiraIssueDTOBuilder createJiraIssueDTO() {
        return new JiraIssueDTOBuilder();
    }

    public JiraIssueDTO build() {
        JiraIssueDTO jiraIssue = new JiraIssueDTO();
        jiraIssue.setId(issue_id);
        jiraIssue.setDescription(description);
        jiraIssue.setClient(client);
        jiraIssue.setCategory(category);
        return jiraIssue;
    }

    public JiraIssueDTOBuilder withId(Long ISSUE_ID) {
        this.issue_id = ISSUE_ID;
        return this;
    }

    public JiraIssueDTOBuilder withDescription(String description) {
        this.description = description;
        return this;
    }

    public JiraIssueDTOBuilder withClient(Client client) {
        this.client = client;
        return this;
    }

    public JiraIssueDTOBuilder withCategory(Category category) {
        this.category = category;
        return this;
    }


}

