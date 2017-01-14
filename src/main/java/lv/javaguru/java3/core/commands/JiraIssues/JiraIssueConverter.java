package lv.javaguru.java3.core.commands.JiraIssues;

/**
 * Created by Viesturs on 06-Nov-16.
 */

import lv.javaguru.java3.core.domain.JiraIssue;
import lv.javaguru.java3.integrations.rest.dto.JiraIssueDTO;
import org.springframework.stereotype.Component;

import static lv.javaguru.java3.integrations.rest.dto.JiraIssueDTOBuilder.createJiraIssueDTO;

@Component
class JiraIssueConverter {

    public JiraIssueDTO convert(JiraIssue jiraIssue) {
        return createJiraIssueDTO()
                .withId(jiraIssue.getId())
                .withDescription(jiraIssue.getDescription())

                .withClient(jiraIssue.getClient())
                .withCategory(jiraIssue.getCategory())
                .build();

    }


}
