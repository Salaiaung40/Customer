package be.Intecbrussel;

public class CustomerFactory {
    final static String[] customers = {"Salai", "Rob", "Bob", "Julie", "Aung"};

    public static AbstractCustomer getCustomer (String name){
        for (String customerName:customers ) {
            if(customerName.equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
