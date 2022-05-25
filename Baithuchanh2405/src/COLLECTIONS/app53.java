package COLLECTIONS;
import java.util.HashSet;
import java.util.Scanner;
public class app53 {
    public static void main(String[] args) {
        int number;
        HashSet<Integer> hashSet = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        hashSet.add(0);
        hashSet.add(3);
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(4);
        hashSet.add(5);

        System.out.println("Các phần tử có trong hashSet là: ");
        System.out.println(hashSet);
        System.out.println("Nhập phần tử cần thêm vào: ");
        number = sc.nextInt();
        sc.close();

        if (!hashSet.contains(number)) {
            hashSet.add(number);
            System.out.println("Thêm phần tử thành công");
            System.out.println("Các phần tử có trong hashSet là: ");
            System.out.println(hashSet);
        } else {
            System.out.println("Phần tử đã tồn tại");
        }

    }
    
}
