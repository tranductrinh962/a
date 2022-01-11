
import java.util.Scanner;
public class Test {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int a;
    float b;
    a = scanner.nextInt();
    b = scanner.nextFloat();
    System.out.println("gia tri cua a: "+a);
    System.out.println("gia tri cua b: "+b);
    scanner.close();
    }
}