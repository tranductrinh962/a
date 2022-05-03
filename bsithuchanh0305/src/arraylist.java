import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();   
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        list.set(5,6);
        System.out.println(list);
    }
}