package lv.javaguru.java3.core.services.jiraIssues;

import lv.javaguru.java3.core.database.JiraIssueDAO;
import lv.javaguru.java3.core.domain.Category;
import lv.javaguru.java3.core.domain.Client;
import lv.javaguru.java3.core.domain.JiraIssue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static lv.javaguru.java3.core.domain.JiraIssueBuilder.createJiraIssue;

/**
 * Created by Viesturs on 06-Nov-16.
 */
@Component
class JiraIssueFactoryImpl implements JiraIssueFactory {

    @Autowired
    private JiraIssueValidator jiraIssueValidator;
    @Autowired private JiraIssueDAO jiraIssueDAO;


    @Override
    public JiraIssue create(String description, Category category, Client client) {
        jiraIssueValidator.validate(description, category);
        JiraIssue jiraIssue = createJiraIssue()
                .withDescription(description)
                .withCategory(category)
                .withClient(client)
                .build();
        jiraIssueDAO.create(jiraIssue);
        return jiraIssue;
    }

}

