package sss;

import java.util.Scanner;

public class Customer extends Person {
  public String Email; 
  public String Name;
  public String Address;
  Scanner sc = new Scanner(System.in);
  
  public Customer(){}
  public void nhapEmail(){
      System.out.println("Hay nhap CustomerEmail ");
      Scanner sc = new Scanner(System.in);
      Email = sc.nextLine();
      sc.close();
  }
  public void nhapName() {
     System.out.println("nhap ten:");
      Scanner sc = new Scanner(System.in);
     Name = sc.nextLine();
      sc.close();
  }
  public void nhapAddress() {
      System.out.println("Hay nhap Address ");
      Scanner sc = new Scanner(System.in);
      Address = sc.nextLine();
      sc.close();
  }
}