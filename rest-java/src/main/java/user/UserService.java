package user;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

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
}