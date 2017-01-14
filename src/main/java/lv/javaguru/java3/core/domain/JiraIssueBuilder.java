package lv.javaguru.java3.core.domain;

/**
 * Created by Viesturs on 06-Nov-16.
 */


public class JiraIssueBuilder {

    private Long issue_id;
    private String description;
    private Category category;
    private Client client;


    private JiraIssueBuilder() {

    }

    public static JiraIssueBuilder createJiraIssue() {
        return new JiraIssueBuilder();
    }

    public JiraIssue build() {
        JiraIssue jiraIssue = new JiraIssue();
        jiraIssue.setId(issue_id);
        jiraIssue.setDescription(description);
        jiraIssue.setCategory(category);
        jiraIssue.setClient(client);


        return jiraIssue;
    }

    public JiraIssueBuilder withId(Long id) {
        this.issue_id = id;
        return this;
    }

    public JiraIssueBuilder withDescription(String description) {
        this.description = description;
        return this;
    }

    public JiraIssueBuilder withCategory(Category category) {
        this.category = category;
        return this;
    }

    public JiraIssueBuilder withClient(Client client) {
        this.client = client;
        return this;
    }
}

