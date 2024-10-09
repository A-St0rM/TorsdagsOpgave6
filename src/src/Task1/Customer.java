package Task1;

import java.util.UUID;

public class Customer {

    private String firstName;
    private String lastName;
    private String userName;
    private int id;
    private static int counter;

    public Customer(String firstName, String userName){
        this.firstName = firstName;
        this.userName = userName;
        id = counter++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }



     public String toString(){
        return "The customers name is " + firstName +" Their username is " + userName;
    }
}
