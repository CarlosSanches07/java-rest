package user;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;

import org.omg.CORBA.OBJECT_NOT_EXIST;

@Path("/user")

/**
 * UserService
 */
public class UserService {
    @GET
    @Path("/list")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Client> getClients(){
        Client client = new Client();
        return client.list();
    }

    @POST
    @Path("/create")
    @Consumes(MediaType.APPLICATION_JSON)
    // @Produces(MediaType.APPLICATION_JSON)
    public void postClient(Object data) {
        new Client().create(data);
    }

    @PUT
    @Path("/update")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Object putClient(Object data) {
        return data;
    }

    @DELETE
    @Path("/delete")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Object delete(Object data) {
        return data;
    }
}