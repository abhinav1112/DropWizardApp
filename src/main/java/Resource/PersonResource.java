package Resource;

import Manager.IPersonManager;
import Pojo.Person;
import com.codahale.metrics.annotation.Timed;
import com.google.inject.Inject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
public class PersonResource {

    private IPersonManager personManager;

    @Inject
    public PersonResource(IPersonManager personManager) {
        this.personManager = personManager;
    }


    @GET
    @Timed
    public Person getPerson(@QueryParam("firstName") String firstName,
                            @QueryParam("lastName") String lastName) {
        Person person = new Person(firstName, lastName);
        personManager.getPersonString(person);
        return person;
    }
}
