import Health.AppHealthCheck;
import Resource.PersonResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class PersonApp extends Application<AppConfiguration> {

    public static void main(String[] args) throws Exception {
        new PersonApp().run(args);
    }

    @Override
    public void run(AppConfiguration defaultConfiguration, Environment environment) throws Exception {
        final PersonResource personResource = new PersonResource(defaultConfiguration.getFirstName(), defaultConfiguration.getLastName());
        environment.jersey().register(personResource);
        environment.healthChecks().register("defaultsource ~/.bash_profile", new AppHealthCheck());
    }

}
