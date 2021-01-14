package Pojo;

public class User implements Person {

    @Override
    public void getPersonType() {
        System.out.println("This is a User");
    }
}
