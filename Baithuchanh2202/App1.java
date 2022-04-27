package Baithuchanh2202;
import java.util.Scanner;
public class App1 {
    public static int UCLN(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return UCLN(b, a % b);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen a = ");
        int a = sc.nextInt();
        System.out.print("Nhap vao so nguyen b = ");
        int b = sc.nextInt();
        System.out.println("Uoc chung lon nhat la: " + UCLN(a, b));
        sc.close();
    }
}

 