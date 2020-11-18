package be.Intecbrussel;
//Step 2
public class RealCustomer extends AbstractCustomer{
    private String name;

    // Constructor with String name as parameter
    public RealCustomer(String name){
        this.name = name;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return "Customer Database name: " + '"' +this.name + '"' ;
    }
}
