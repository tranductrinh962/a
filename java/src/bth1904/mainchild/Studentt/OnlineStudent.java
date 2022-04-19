package mainchild.Studentt;

public class OnlineStudent extends Student {
   public String svnghihoc ;
   
   public String getSvnghihoc(){
       return svnghihoc;
   }
   public void getSvnghihoc(String svnghihoc){
       this.svnghihoc=svnghihoc;
   }
   public void nhapthongtin(){
       super.nhapthongtin();
       Scanner sc = new Scanner(System.in);
       System.out.print("Tên sinh viên nghỉ học ");
       svnghihoc=sc.nextLine();
   }
   public void inthongtin(){
       super.inthongtin();
       System.out.println("Sinh viên nghỉ học là :  "    +svnghihoc);
   }
}