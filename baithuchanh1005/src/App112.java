import java.util.ArrayList;
import java.util.Scanner;

public class App112 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String ten;
        float diem;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Nhap vao sinh vien thu " + i + " : ");
            ten = sc.nextLine();
            diem=sc.nextFloat();
            array.add(ten);
            sc.close();
            if(sinhvien(ten) == null){
                break;
            }
        }
    }
    private static Object sinhvien(String ten) {
        return null;
    }


}