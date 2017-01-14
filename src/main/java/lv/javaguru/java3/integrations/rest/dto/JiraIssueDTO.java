package lv.javaguru.java3.integrations.rest.dto;

import lv.javaguru.java3.core.domain.Category;
import lv.javaguru.java3.core.domain.Client;

import java.io.Serializable;

/**
 * Created by Viesturs on 06-Nov-16.
 */
public class JiraIssueDTO implements Serializable {

    private Long issue_id;
    private String description;
    private Client client;
    private Category category;


    public Long getId() {
        return issue_id;
    }

    public void setId(Long id) {
        this.issue_id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Category getCategory(){return category;}
    public void setCategory(Category category){this.category = category;}

}
