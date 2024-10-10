package Task1;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();

        Customer customer1 = new Customer("Jeppe ", "Høst ", "Happy helper69 ");
        Customer customer2 = new Customer("Bilal ", "Bin Laden ", "discordNitro420 ");
        Customer customer3 = new Customer("Rasmus ", "Juul ", "Vær hilset24");
        Customer customer4 = new Customer("Preben", "Green", "ComeWithChrist23");

        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);

        printCustomers(customers);

    }
    public static void printCustomers(ArrayList<Customer> customers){
        for(Customer c : customers){
            System.out.println(c);
        }
        }

}


