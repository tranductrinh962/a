package baithuchanh0103.baithuchanhchuong2;
import java.util.Scanner;
public class Appbai1 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("nhập số thứ nhất: ");
		int a=sc.nextInt();
		System.out.println("nhập số thứ hai: ");
		int b=sc.nextInt();
		System.out.println("a+b= "+(a+b));
		System.out.println("a-b= "+(a-b));
		System.out.println("a*b= "+(a*b));
		System.out.println("a/b= "+(a/b));
		System.out.println("a&b= "+(a%b));
		System.out.println("a > b ?: "+(a>b));
		System.out.println("a = b ?: "+(a==b));
		sc.close();

	}

}