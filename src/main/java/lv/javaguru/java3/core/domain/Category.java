package lv.javaguru.java3.core.domain;

/**
 * Created by Viesturs on 06-Nov-16.
 */

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="category")
public class Category {

public Category(){}

    public Category (Long category_id){
        this.category_id = category_id;
    }
    @Column(name="category_id", columnDefinition="int")
    @Id
    @GeneratedValue(generator = "category_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "category_seq", sequenceName = "category_seq", allocationSize = 1)
   private Long category_id;

    @Enumerated(EnumType.STRING)
    @Column(name="CATEGORY_SHORT_NAME")
    private CategoryName categoryName;
    @Column(name="CATEGORY_DESCRIPTION")
    private String categoryDescription;


    @OneToMany(cascade=CascadeType.ALL
            , fetch = FetchType.EAGER
            ,orphanRemoval = true
    )
    @JoinTable(name="category_issue_junction",
            joinColumns = {@JoinColumn(name="category_id")},
            inverseJoinColumns={@JoinColumn(name="issue_id")})
   // @JsonIgnore
    private List<JiraIssue> issues;

    public Long getCategoryId() { return category_id; }
    public void setCategoryId(Long id) { this.category_id = id;}


    public String getCategoryDescription() {return categoryDescription;}
    public void setCategoryDescription(String categoryDescription) { this.categoryDescription = categoryDescription; }

    public CategoryName getCategoryName () {return categoryName;}
    public void setCategoryName (CategoryName categoryName) {this.categoryName=categoryName;}



    public List<JiraIssue> getIssueList() {return issues;}


    @JsonIgnore
    public void setIssueList(List<JiraIssue> issues) { this.issues = issues;}



    public String toString() {
        return "Category name:"  + categoryName + ", Category Id "+ category_id +", Category Description: "
                + categoryDescription;
    }

    /*private enum CategoryName{
        FLAT_FOR_RENT, FLAT_FOR_SALE, HOUSE_FOR_RENT, HOUSE_FOR_SALE
    }*/
}

