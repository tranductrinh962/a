package shape;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class Point {
 
    private String a;
    private int x;
    private int y;

    public void Ponit (String a, int x, int y){
        this.x=x;
        this.y=y;
    }
    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public int getX() {

        return x;
    }
    
    public void setX(int x) {

        this.x = x;
    }
    
    public int getY() {
        return y;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    public void Nhap() {
        Scanner sc = new Scanner(in);
        out.println("Nhap ten diem: ");
        a = sc.nextLine();
        out.println("nhap hoanh do x: ");
        x = Integer.parseInt(sc.nextLine());
        out.println("nhap tung do y:");
        y = Integer.parseInt(sc.nextLine());
        sc.close();
    }
    public void HienThi(){
        out.println("Diem vua nhap: "+a+"("+x+","+y+")");
    }
    public double tinhKC(Point d2){
        return Math.sqrt((x-d2.x)*(x-d2.x)+(y-d2.y)*(y-d2.y));
    }
}