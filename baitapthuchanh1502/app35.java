package baitapthuchanh1502;
import java.util.Scanner;
public class app35 {
    public static void main(String[] args) throws Exception {
        int firstNumber, secondNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhất: ");
        firstNumber = scanner.nextInt();
        System.out.println("Nhập vào số thứ hai: ");
         secondNumber = scanner.nextInt();
         int minNumber = firstNumber;
    if (firstNumber > secondNumber) {
      minNumber = secondNumber;
  System.out.println("Số nhỏ nhất trong 2 số " + firstNumber + " và "+ secondNumber+ "là " + minNumber);
    }
    scanner.close();
    } 
}


