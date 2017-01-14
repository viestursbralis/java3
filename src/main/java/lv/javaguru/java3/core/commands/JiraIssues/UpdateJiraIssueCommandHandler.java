package lv.javaguru.java3.core.commands.JiraIssues;

import lv.javaguru.java3.core.commands.clients.UpdateClientCommand;
import lv.javaguru.java3.core.commands.clients.UpdateClientResult;
import lv.javaguru.java3.core.domain.JiraIssue;
import lv.javaguru.java3.core.services.DomainCommandHandler;
import lv.javaguru.java3.core.services.jiraIssues.JiraIssueService;
import lv.javaguru.java3.integrations.rest.dto.JiraIssueDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Viesturs on 12-Nov-16.
 */
@Component
class UpdateJiraIssueCommandHandler
        implements DomainCommandHandler<UpdateJiraIssueCommand, UpdateJiraIssueResult> {

    @Autowired
    private JiraIssueService jiraIssueService;
    @Autowired private JiraIssueConverter jiraIssueConverter;


    @Override
    public UpdateJiraIssueResult execute(UpdateJiraIssueCommand command) {
        JiraIssue jiraIssue = jiraIssueService.update(
                command.getIssueId(),
                command.getDescription(),
                command.getCategory()
        );
        JiraIssueDTO jiraIssueDTO = jiraIssueConverter.convert(jiraIssue);
        return new UpdateJiraIssueResult(jiraIssueDTO);
    }

    @Override
    public Class getCommandType() {
        return UpdateJiraIssueCommand.class;
    }

}
