package Task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer("Jack", "PirateJack"));
        customers.add(new Customer("John", "PirateJohn"));

        printCustomers(customers);

    }

    public static void printCustomers(ArrayList<Customer> customers){
        for(Customer customer : customers){
            System.out.println(customer);
        }

    }
}
