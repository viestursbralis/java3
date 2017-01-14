package lv.javaguru.java3.core.commands.JiraIssues;

import lv.javaguru.java3.core.domain.JiraIssue;
import lv.javaguru.java3.core.services.DomainCommandHandler;
import lv.javaguru.java3.core.services.jiraIssues.JiraIssueFactory;
import lv.javaguru.java3.integrations.rest.dto.JiraIssueDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Viesturs on 06-Nov-16.
 */
@Component
class CreateJiraIssueCommandHandler
        implements DomainCommandHandler<CreateJiraIssueCommand, CreateJiraIssueResult> {

    @Autowired
    private JiraIssueFactory jiraIssueFactory;
    @Autowired private JiraIssueConverter jiraIssueConverter;


    @Override
    public CreateJiraIssueResult execute(CreateJiraIssueCommand command) {
        JiraIssue jiraIssue = jiraIssueFactory.create(
                command.getDescription(),

                command.getCategory(),
                command.getClient()

        );
        JiraIssueDTO jiraIssueDTO = jiraIssueConverter.convert(jiraIssue);
        return new CreateJiraIssueResult(jiraIssueDTO);
    }

    @Override
    public Class getCommandType() {
        return CreateJiraIssueCommand.class;
    }

}

