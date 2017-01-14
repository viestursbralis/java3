package lv.javaguru.java3.core.commands.JiraIssues;

import lv.javaguru.java3.core.commands.clients.GetClientCommand;
import lv.javaguru.java3.core.commands.clients.GetClientResult;
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
class GetJiraIssueCommandHandler
        implements DomainCommandHandler<GetJiraIssueCommand, GetJiraIssueResult> {

    @Autowired
    private JiraIssueService jiraIssueService;
    @Autowired
    private JiraIssueConverter jiraIssueConverter;


    @Override
    public GetJiraIssueResult execute(GetJiraIssueCommand command) {
        JiraIssue jiraIssue = jiraIssueService.get(command.getJiraIssueID());
        JiraIssueDTO jiraIssueDTO = jiraIssueConverter.convert(jiraIssue);
        return new GetJiraIssueResult(jiraIssueDTO);
    }

    @Override
    public Class getCommandType() {
        return GetJiraIssueCommand.class;
    }

}

