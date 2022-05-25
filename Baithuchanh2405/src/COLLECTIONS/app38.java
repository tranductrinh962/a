package COLLECTIONS;
import java.util.LinkedList;
public class app38 {
public static void main(String[] args){
        
    LinkedList<String> list = new LinkedList<String>();
   
    list.add("Java");
    list.add("C++");
    list.add("PHP");
    list.add("Java");
    System.out.println("ví dụ sử dụng phương thức addAll()");
    System.out.println("-------------------------------------");
    LinkedList<String> listA = new LinkedList<String>();
    listA.addAll(list);
    System.out.print("listA:");
    showList(listA);
    System.out.println("\nví du sử dụng phương thức retainAll()");
    System.out.println("-------------------------------------");

LinkedList<String> listB = new LinkedList<String>();
listB.add("Java");

listA.retainAll(listB);
System.out.print("listA:");
showList(listA);
System.out.println("\nví du sử dụng phương thức removeAll()");
System.out.println("---------------------------------------");

list.removeAll(listB);
System.out.print("list:");
showList(list);
}
public static void showList(LinkedList<String> listA) {

for (String obj : listA){
System.out.print("it"+obj+", ");
}
System.out.println();
}
}
