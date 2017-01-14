package lv.javaguru.java3.core.commands.JiraIssues;

import lv.javaguru.java3.core.commands.DomainCommand;
import lv.javaguru.java3.core.domain.Category;
import lv.javaguru.java3.core.domain.Client;

/**
 * Created by Viesturs on 06-Nov-16.
 */
public class CreateJiraIssueCommand implements DomainCommand<CreateJiraIssueResult> {

    private String description;
    private Category category;
    private Client client;


    public CreateJiraIssueCommand(String description
            ,  Category category
            , Client client) {
        this.description = description;
        this.client = client;
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public Client getClient() {
        return client;
    }

    public Category getCategory(){return category;}

}
