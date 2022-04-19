package mainchild;
import java.util.Scanner;
public class Student extends Person {
    
    protected int id;
    protected double diemtk;
    
    public Student(){
        
    }
    
    public Student(int id , String ten , int tuoi , double diemtk){
        this.id=id;
        this.ten=ten;
        this.tuoi=tuoi;
        this.diemtk=diemtk;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public double getDiemtk(){
        return diemtk;
    }
    public void setDiemtk(double diemtk){
        this.diemtk=diemtk;
    }
    @Override
    public void nhapthongtin(){
        super.nhapthongtin();
        Scanner sc = new Scanner(System.in);
        System.out.print(" Nhập Id: " );
        id=sc.nextInt();
        System.out.print("Nhập điểm tổng kết :");
        diemtk=sc.nextDouble();
        sc.close();
    }
    @Override
    public void inthongtin(){
        super.inthongtin();
        System.out.println("Id là :"   +id);
        System.out.println("Điểm tổng kết :  "  +diemtk);
    }
}