package lv.javaguru.java3.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="clients")
public class Client {

    @Id
    @GeneratedValue(generator = "clients_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "clients_seq", sequenceName = "clients_seq", allocationSize = 1)
    @Column(name="client_id", nullable = false)
    private Long client_id;

    @Column(name="login", nullable = false)
    private String login;

    @Column(name="password", nullable = false)
    private String password;



    @JsonIgnore
    @OneToMany(cascade=CascadeType.ALL
            , fetch = FetchType.EAGER
            ,orphanRemoval = true
    )
    @JoinTable(name="client_issue_junction",
            joinColumns = {@JoinColumn(name="client_id")},
            inverseJoinColumns={@JoinColumn(name="issue_id")})
    private List<JiraIssue> issues;





    public Long getId() {
        return client_id;
    }

    public void setId(Long client_id) {
        this.client_id = client_id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<JiraIssue> getIssues(){
        return this.issues;
    }
    public void setIssues(List<JiraIssue> is){
        this.issues = is;
    }

}
