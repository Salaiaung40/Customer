package be.Intecbrussel;

public class NullPatternDemo {

    public static void main(String[] args) {
        AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
        AbstractCustomer customer7 = CustomerFactory.getCustomer("Sarah");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
        AbstractCustomer customer4 = CustomerFactory.getCustomer("Salai");
        AbstractCustomer customer5 = CustomerFactory.getCustomer("Aung");
        AbstractCustomer customer6 = CustomerFactory.getCustomer("David");

        System.out.println("Customers");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer7.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());
        System.out.println(customer5.getName());
        System.out.println(customer6.getName());

    }
}
