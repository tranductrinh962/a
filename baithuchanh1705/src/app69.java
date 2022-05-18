import java.util.TreeSet;
import java.util.Scanner;

public class app69 {
    public static void main(String[] args){
        int number;
        TreeSet<Integer> treeSetInteger=new TreeSet<>();
        Scanner scanner=new Scanner(System.in);

        treeSetInteger.add(0);
        treeSetInteger.add(3);
        treeSetInteger.add(1);
        treeSetInteger.add(4);
        treeSetInteger.add(2);
        treeSetInteger.add(8);
        treeSetInteger.remove(0);

        System.out.println("Cac phan tu trong TreeSetInterger: ");
        System.out.println(treeSetInteger);
        System.out.println("Nhap phan tu can them: ");
        number=scanner.nextInt();
        scanner.close();

        if (!treeSetInteger.contains(number)){
            treeSetInteger.add(number);
            System.out.println("Them thanh cong!");
            System.out.println("Cac phan tu trong TreeSetInterger sau khi them: ");
            System.out.println(treeSetInteger);
        }else{
            System.out.println("Phan tu"+number+"da ton tai");
        }
    }
    
}
