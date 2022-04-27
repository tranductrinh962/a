package sss;

public class VIPCustomer extends Person{
    public String Address;
    public String Email;
    public int Discout;
  
    public VIPCustomer(int Discout, String Address, String Email) {
      System.out.println("Khach hang VIP se nhan duoc 1 ve Discout giam 20% !!!");
    }
  }
