package be.Intecbrussel;
//Step 4
public class CustomerFactory {
    //final array of String objects and initialize it immediately with a few names.
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
