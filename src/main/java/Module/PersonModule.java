package Module;

import Pojo.Employee;
import Pojo.Person;
import com.google.inject.AbstractModule;

public class PersonModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Person.class).to(Employee.class);
    }
}
