package mainchild;
import java.util.Scanner;
public class Employee extends Person{
    int songaylamviec;
    Scanner sc = new Scanner(System.in);
    public Employee(){}

    public void settennhanvien(){
        System.out.println("nhap ten nhan vien: ");
        PersonName= sc.nextLine();
    }

    public void gettennhanvien(){
        System.out.println( "ten nhan vien la: "+PersonName);
    }

    public  void setgdanhso(){
        System.out.println("nhap danh so nhan vien");
        PersonID=sc.nextLine();
    }

    public void getdanhso(){
        System.out.println( "nhan vien mang danh so: "+PersonID);
    }

}