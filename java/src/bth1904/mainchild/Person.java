package mainchild;
import java.util.Scanner;
class Person {
   protected String ten;
   protected int tuoi;
   public Person(){
       
   }
   
   public Person (String ten , int tuoi){
       this.ten=ten;
       this.tuoi=tuoi;
   }
   public String getTen(){
       return ten;
   }
   public void setTen(String ten){
       this.ten=ten;
   }
   
   public int getTuoi(){
       return tuoi;
   }
   public void setTuoi(int tuoi){
       this.tuoi=tuoi;
   }
   
   public void nhapthongtin(){
       Scanner sc = new Scanner(System.in);
       System.out.print("Nhập Họ tên: ");
        ten=sc.nextLine();
       System.out.print (" Nhập tuổi:  ");
        tuoi=sc.nextInt();
        sc.close();
   }
   public void inthongtin(){
       System.out.println(" Họ Tên là :  "  + ten);
       System.out.println("Tuổi là : " + tuoi);
   }
}