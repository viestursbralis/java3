package lv.javaguru.java3.core.services.clients;

import lv.javaguru.java3.core.domain.Client;
import lv.javaguru.java3.core.domain.JiraIssue;

import java.util.List;


public interface ClientService {

    Client update(Long clientId,
                  String newLogin,
                  String newPassword,
                  List<JiraIssue> issues
                  );

    Client get(Long clientId);

}
