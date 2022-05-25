package COLLECTIONS;
import java.util.ArrayList;
public class app21 {
    public static void main(String[] args){
        ArrayList<String> colors = new ArrayList<String>(3);
        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add("yellow");
        colors.add("orange");
        colors.add("pink");
        colors.remove("green");

        System.out.println(colors.get(1));
        System.out.println(colors.contains("orange"));
        System.out.println(colors.size());
        System.out.println(colors);
    }
    
}
