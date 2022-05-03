import java.util.ArrayList;
import java.util.Scanner;
public class app22{
    public static void main(String[] args){
        ArrayList<Integer> arrlistinteger = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int number; 
        System.out.println("Nhập số phần tử của ArrayList: ");
        int n=sc.nextInt();
       
        for (int i = 0; i< n; i++){
            System.out.print("Nhập phần tử thứ "+i+": ");
           number=sc.nextInt();
           arrlistinteger.add(number);
           sc.close();
        }
       
        int max=arrlistinteger.get(0);
        for (int i = 1; i < arrlistinteger.size(); i++){
          
            if (arrlistinteger.get(i).compareTo(max) > 0) {
               max = arrlistinteger.get(i);
            }
        }
        System.out.println("Phần tử lớn nhất trong arrlistInteger = "+ max);
    }
}
