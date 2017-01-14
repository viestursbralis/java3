package lv.javaguru.java3.core.services.clients;

import lv.javaguru.java3.core.domain.Client;
import lv.javaguru.java3.core.domain.JiraIssue;

import java.util.List;

public interface ClientFactory {

    Client create(String login, String password, List<JiraIssue> issues);

}
