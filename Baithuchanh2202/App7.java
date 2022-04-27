package Baithuchanh2202;
import java.util.Scanner;
public class App7 {
    public static void main(String... args) {
        double max = 0;
        System.out.println("nhap so: ");
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        while (n != 0) {
            if (max < n) {
                max = n;
            }
            n = sc.nextDouble();
        }

        System.out.print("so lon nhat la " + max);
        sc.close();
    }
}
