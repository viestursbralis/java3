package lv.javaguru.java3.integrations.rest.api;

import lv.javaguru.java3.integrations.rest.dto.JiraIssueDTO;

import javax.ws.rs.*;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

/**
 * Created by Viesturs on 06-Nov-16.
 */
@Path(RESTResource.API_PATH)
public interface JiraIssueResource {

    @POST
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/issues")
    JiraIssueDTO create(JiraIssueDTO jiraIssueDTO);

    @GET
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/issues/{issueId}")
    JiraIssueDTO get(@PathParam("issueId") Long issueId);

}
