package lv.javaguru.java3.core.services.jiraIssues;

import lv.javaguru.java3.core.domain.Category;

/**
 * Created by Viesturs on 12-Nov-16.
 */
public interface JiraIssueValidator {

    void validate(String description,  Category category);

}
