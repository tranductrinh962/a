package mainchild;

import java.util.Scanner;

public class Customer extends Person {
    public String CustomerEmail; 
    public String CustomerName;
    public String Address;
    Scanner sc = new Scanner(System.in);

    public Customer(){}

    public void nhapCustomerEmail(){
        System.out.println("Hay nhap CustomerEmail ");
        Scanner sc = new Scanner(System.in);
        CustomerEmail = sc.nextLine();
        sc.close();
    }

    public void nhapCustomerName() {
       System.out.println("nhap ten:");
        Scanner sc = new Scanner(System.in);
        CustomerName = sc.nextLine();
        sc.close();
    }

    public void nhapAddress() {
        System.out.println("Hay nhap Address ");
        Scanner sc = new Scanner(System.in);
        Address = sc.nextLine();
        sc.close();
    }
}
