package lv.javaguru.java3.core.services.jiraIssues;

import lv.javaguru.java3.core.domain.Category;
import lv.javaguru.java3.core.domain.JiraIssue;

/**
 * Created by Viesturs on 06-Nov-16.
 */
public interface JiraIssueService {

    JiraIssue update(Long ISSUE_ID,
                     String newDescription,
                     Category category);

    JiraIssue get(Long ISSUE_ID);

}
