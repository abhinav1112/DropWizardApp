import Health.AppHealthCheck;
import Module.PersonModule;
import Resource.PersonResource;
import com.google.inject.Guice;
import com.google.inject.Injector;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class PersonApp extends Application<AppConfiguration> {

    public static void main(String[] args) throws Exception {
        new PersonApp().run(args);
    }

    @Override
    public void run(AppConfiguration defaultConfiguration, Environment environment) throws Exception {
        Injector injector = Guice.createInjector(new PersonModule());
        final PersonResource personResource = injector.getInstance(PersonResource.class);

        environment.jersey().register(personResource);
        environment.healthChecks().register("defaultsource ~/.bash_profile", new AppHealthCheck());
    }

}
