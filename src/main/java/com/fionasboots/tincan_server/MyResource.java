
package com.fionasboots.tincan_server;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

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
    	Activity result = new Activity();
    	result.setUser("Flo");
    	result.setActivity("Testing");
    	result.setWhen("Now");
        return Response.status(Status.OK).entity(result).build();
    }
    
    
    @POST
    @Path("/post")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response postIt(Activity activity) {
    	
    	Activity result = new Activity();
    	result.setUser("me");
    	
    	return Response.status(Status.OK).entity(result).build();
    }
    
    
}
