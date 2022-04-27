package baithuchanh0103.baithuchanhchuong2;
import java.util.Scanner;
public class Appbai6 {
    public static void main(String[] args) {
        int so, t = 1;
        long giaiThua = 1;       
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập vào 1 số bất kỳ: ");
            so = sc.nextInt();
        } while ((so <= 0) || (so > 10));
        while (t <= so) {
            giaiThua *= t;
            t++;
        }
        System.out.println(so + "! = " + giaiThua);
        sc.close();
    }
 
}