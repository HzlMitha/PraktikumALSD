package Praktikum12;
import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<Customer05> customers = new ArrayList<>();

        Customer05 customer1 = new Customer05(1, "Zakia");
        Customer05 customer2 = new Customer05(5, "Budi");

        customers.add(customer1);
        customers.add(customer2);

        customers.add(new Customer05(4, "Cica"));

        customers.add(2, new Customer05(100, "Rosa"));

        System.out.println(customers.indexOf(customer2));

        Customer05 customer = customers.get(1);
        System.out.println(customer.name);
        customer.name = "Budi Utomo";

        ArrayList<Customer05> newCustomers = new ArrayList<>();
        newCustomers.add(new Customer05(201, "Della"));
        newCustomers.add(new Customer05(202, "Victor"));
        newCustomers.add(new Customer05(203, "Sarah"));

        customers.addAll(newCustomers);

        for (Customer05 cust : customers) {
            System.out.println(cust.toString());
        }
        System.out.println();

        customers.sort((c1, c2) -> c1.name.compareTo(c2.name));

        System.out.println(customers);

    }
}
