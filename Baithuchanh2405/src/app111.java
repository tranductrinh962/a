import java.util.LinkedList;
import java.util.Scanner;
public class app111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        System.out.println("Nhập vào số phần tử của danh sách: ");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập vào phần tử thứ " + (i + 1) + ": ");
            int x = sc.nextInt();
            linkedList.add(x);
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (linkedList.get(i) % 2 == 0) {
                sum += linkedList.get(i);
            }
        }
        System.out.println("Trung bình cộng của các số chẵn là: " + sum / 2);
        sc.close();
    }
    
}
