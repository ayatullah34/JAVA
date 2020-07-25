import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Customer> customers=new ArrayList<Customer>();

        customers.add(new Customer(1,"engin","demir"));
        customers.add(new Customer(2,"derin","demir"));
        customers.add(new Customer(3,"salih","demir"));

        customers.remove(new Customer(1,"engin","demir"));//NEW DEDİĞİMİZ İÇİN YENİ BİR TANE OLUŞTURUYORUZ REMOVE İŞE YARAMAZ

        for (Customer customer:customers) {
            System.out.println(customer.firstName);
        }
    }
}
