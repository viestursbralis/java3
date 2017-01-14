package lv.javaguru.java3.config;

import lv.javaguru.java3.integrations.rest.impl.ClientResourceImpl;
import lv.javaguru.java3.integrations.rest.impl.JiraIssueResourceImpl;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        //register(ClientResourceImpl.class);//šis arī strādā;
        //register(JiraIssueResourceImpl.class); //šis arī strādā;
        packages(true, "lv.javaguru.java3.integrations.rest.impl");

    }

}
