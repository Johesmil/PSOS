package psos.services.mail;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/HelloService")
public class MailService {
	
	@GET
    public String sayHelloWorld(){
        return "Hello World";
    }
	
	@GET
    @Path("{name}")
    public String sayHello(@PathParam("name") String name){
        StringBuilder stringBuilder = new StringBuilder("Hello ");
        stringBuilder.append(name).append("!");

        return stringBuilder.toString();
    }
}