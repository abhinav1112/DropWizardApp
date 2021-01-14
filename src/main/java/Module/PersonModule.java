package Module;

import Manager.IPersonManager;
import Manager.PersonManager;
import com.google.inject.AbstractModule;

public class PersonModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(IPersonManager.class).to(PersonManager.class);
    }
}
