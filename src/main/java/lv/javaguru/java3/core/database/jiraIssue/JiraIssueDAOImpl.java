package lv.javaguru.java3.core.database.jiraIssue;

import lv.javaguru.java3.core.database.JiraIssueDAO;
import lv.javaguru.java3.core.domain.JiraIssue;
import org.springframework.stereotype.Component;

/**
 * Created by Viesturs on 06-Nov-16.
 */
@Component
class JiraIssueDAOImpl extends CRUDOperationDAOImpl<JiraIssue, Long> implements JiraIssueDAO {

}
