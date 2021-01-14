package Pojo;

public class Employee implements Person {

    @Override
    public void getPersonType() {
        System.out.println("This is a Employee");
    }
}
