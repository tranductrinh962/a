package baithuchanh2203;
import java.util.Scanner;
public class person {
    public static Scanner sc = new Scanner(System.in);
   String PersonID , PersonName, address;
   Boolean Gender;
   void NhapPersonID(){
       System.out.print("PersonID : ");
       PersonID = sc.nextLine();
   }
   void NhapPersonName(){
       System.out.print("Person name: " );
       PersonName = sc.nextLine();
   }
   void NhapGender(){
       System.out.print("Gender : ");
       Gender = sc.nextBoolean();
   }
   void NhapAddress(){
         System.out.print("address : ");
          address = sc.nextLine();
   }
   void In(){
       System.out.println("Person  "+ PersonID+ " " + PersonName+ " "+ Gender +" " +address);
   }
   
}
