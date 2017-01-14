package lv.javaguru.java3.core.domain;

/**
 * Created by Viesturs on 06-Nov-16.
 */
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name="jira_issue")
public class JiraIssue {

    @Id
    @GeneratedValue(generator = "jira_issue_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "jira_issue_seq", sequenceName = "jira_issue_seq", allocationSize = 1)
    @Column(name="issue_id", nullable = false)
    private Long issue_id;

    @Column(name="description", nullable = false)
    private String description;

    @ManyToOne
    @JoinTable(name = "category_issue_junction",//@JoinTable dinamiski rada "category_issue_junction" tabulu;
            joinColumns={@JoinColumn(name="issue_id")},
            inverseJoinColumns={@JoinColumn(name="category_id")})
    @JsonIgnore
    private Category category;

    //@JsonIgnore
    //@ManyToOne(fetch = FetchType.EAGER)
    //@JoinColumn(name = "CLIENT_ID", nullable = false)
    //private Client client;
    @ManyToOne
    @JoinTable(name = "client_issue_junction",
            joinColumns={@JoinColumn(name="issue_id")},
            inverseJoinColumns={@JoinColumn(name="client_id")})
    @JsonIgnore
    private Client client;





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

public Category getCategory(){return category;}
public void setCategory(Category category){this.category = category;}
    public Client getClient(){return client;}
    public void setClient(Client client){this.client = client;}
}

