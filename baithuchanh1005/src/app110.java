import java.util.ArrayList;
import java.util.Scanner;
public class app110 {
    public static void main(String[] args){
        ArrayList<Integer> array = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int number;
        
        System.out.println("Nhap so luong so nguyen");
        int n = sc.nextInt();
        for( int i=0; i<=n; i++){
            System.out.println("Nhap so nguyen thu" +i);
            number = sc.nextInt();
            array.add(number);
            sc.close();
        }
        int max = array.get(0);
        for(int i = 1; i < array.size();i++ ){
            if(array.get(i).compareTo(max)>0){
                max=array.get(i);
            }
        }
        System.out.println("phan tu lon nhat trong mang la: "+max);

       System.out.println("nhap vao 1 so nguyen");
       int a = sc.nextInt();
       ArrayList<Integer> list = new ArrayList<>();
       list.add(a);
       array.removeAll(list);
       System.out.print("Cac phan tu sau khi da loai bo la");
       for(int i=0; i<array.size(); i++){
        System.out.print(array.get(i) +"\t");
       }
   
        System.out.print("Sap xep day so: ");
        for (int i = 0; i < array.size()-1; i++){
            for (int j = i+1; i < array.size(); j++){
                if (array.get(i) > array.get(j)){
                    int temp = array.get(i);
                    array.set(i, array.get(j));
                    array.set(j, temp);
                }
            }
        }
        System.out.print("List sau khi sap xep: ");
        for (int i = 0; i < array.size(); i ++){
            System.out.print(array.get(i) + "\t ");
        }
    }

}