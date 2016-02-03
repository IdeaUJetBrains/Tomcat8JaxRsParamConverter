package example.paramconverter;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * @author Arun Gupta
 * @author Xavier coulon
 */
@Path("/endpoint")
public class MyResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getWithQuery(@DefaultValue("bar") @QueryParam("search") MyBean myBean) {
        return myBean.getValue();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getByPath(@PathParam("id") MyBean myBean) {
        return myBean.getValue();
    }
}
