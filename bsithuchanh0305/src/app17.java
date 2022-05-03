import java.util.ArrayList;
public class app17 {
    public static void main(String[] args){
        
         ArrayList<Integer> arrlistInteger=new ArrayList<>();
         
         arrlistInteger.add(0);
         arrlistInteger.add(7);
         arrlistInteger.add(1);
         arrlistInteger.add(9);
       
         System.out.println("Các phần tử có trong arrListInteger là: ");
         for (int number:arrlistInteger){
             System.out.print(number+"\t");
}
    }
}