package Manager;

import Pojo.Person;

public class PersonManager implements IPersonManager {

    @Override
    public void getPersonString(Person person) {
        System.out.println("Inside person manager");
        System.out.println(person);
    }
}
