package lv.javaguru.java3.core.services.jiraIssues;

import lv.javaguru.java3.core.domain.Category;
import lv.javaguru.java3.core.domain.Client;
import lv.javaguru.java3.core.domain.JiraIssue;

/**
 * Created by Viesturs on 06-Nov-16.
 */
public interface JiraIssueFactory {

    JiraIssue create(String description, Category category,Client client);

}
