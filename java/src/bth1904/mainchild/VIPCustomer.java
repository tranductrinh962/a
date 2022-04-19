package mainchild;

public class VIPCustomer extends Person{
    
    private String name;
    private double creditLimit;
    private String email;
        
    public VIPCustomer() {
        this("Default", 0.0, "example@company.com");
    }
    
    public VIPCustomer(String name, double creditLimit) {
        this(name, creditLimit, "example@company.com");
    }
        
    public VIPCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }
        
    public String getName() {
        return this.name;
    }
        
    public double getCreditLimit() {
        return this.creditLimit;
    }
        
    public String getEmail() {
        return this.email;
    }
}
