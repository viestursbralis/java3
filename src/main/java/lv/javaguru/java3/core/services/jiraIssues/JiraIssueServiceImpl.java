package lv.javaguru.java3.core.services.jiraIssues;

import lv.javaguru.java3.core.database.JiraIssueDAO;
import lv.javaguru.java3.core.domain.Category;
import lv.javaguru.java3.core.domain.JiraIssue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Viesturs on 06-Nov-16.
 */
@Component
class JiraIssueServiceImpl implements JiraIssueService {

    @Autowired
    private JiraIssueDAO jiraIssueDAO;
    @Autowired private JiraIssueValidator jiraIssueValidator;


    @Override
    public JiraIssue update(Long issue_id,
                            String newDescription,
                            Category category
                            ) {
        jiraIssueValidator.validate(newDescription, category);
        JiraIssue jiraIssue = get(issue_id);
        jiraIssue.setDescription(newDescription);
        jiraIssue.setCategory(category);
       // jiraIssue.;//there could be setStatuss() -  not implemented yet!
        return jiraIssue;
    }

    @Override
    public JiraIssue get(Long issue_id) {
        return jiraIssueDAO.getRequired(issue_id);
    }

}
