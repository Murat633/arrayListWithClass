import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer(1,"Murat","Akyol"));
        customers.add(new Customer(2,"Ahmet","Piyaz"));
        customers.add(new Customer(3,"Muhammet","Demir"));



        for (Customer customer:customers){
            System.out.println(customer);
        }
    }
}