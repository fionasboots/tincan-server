
package com.fionasboots.tincan_server;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.fionasboots.tincan.xapi.objects.Statement;
import com.fionasboots.tincan.xapi.objects.UUID;

/** Example resource class hosted at the URI path "/myresource"
 */
@Path("/myresource")
public class MyResource {
    
    /** Method processing HTTP GET requests, producing "text/plain" MIME media
     * type.
     * @return String that will be send back as a response of type "text/plain".
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getIt() {
    	Statement result = new Statement();
    	UUID id = new UUID();
    	id.setValue("Unique-1");
    	result.setId(id);
        return Response.status(Status.OK).entity(result).build();
    }
    
    
    @POST
    @Path("/post")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response postIt(Statement statement) {
    	
    	Statement result = new Statement();
    	UUID id = new UUID();
    	id.setValue("Unique-2");
    	result.setId(id);
    	
    	return Response.status(Status.OK).entity(result).build();
    }
    
    
}
