import java.util.ArrayList;
import java.util.Iterator;
public class app18 {
    public static void main(String[] args){
        
         ArrayList<Float> arrlistFloat=new ArrayList<>();
      
         arrlistFloat.add(0.7f);
         arrlistFloat.add(7.26f);
         arrlistFloat.add(1.e2f);
         arrlistFloat.add(9.3f);
       
         Iterator<Float> iterator=arrlistFloat.iterator();
         System.out.println("Các phần tử có trong arrListFloat là: ");
         while (iterator.hasNext ()){
             System.out.print(iterator.next()+"\t");
}
    }
}
