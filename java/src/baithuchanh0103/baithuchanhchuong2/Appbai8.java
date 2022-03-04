package baithuchanh0103.baithuchanhchuong2;
import java.util.Scanner;
public class Appbai8 {
    public static void main(String[] args) {
		int n, sum = 0, number;
		float tbc;
		Scanner sc = new Scanner(System.in);	
		System.out.println("Nhập vào số các số nguyên có trong dãy: ");
		n = sc.nextInt();
		for (int count = 1; count <=n; count++) {
			System.out.println("Nhập số thứ " + count + ": ");
			number = sc.nextInt();
			sum += number;
		}
		tbc = (float) sum / n;
		System.out.println("Trung bình cộng = " + tbc);
        sc.close();
	}
}

