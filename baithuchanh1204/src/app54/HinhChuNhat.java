package app54;
import java.util.Scanner;
public class HinhChuNhat extends HinhHoc {
   public float dai;
   public float rong;
   public HinhChuNhat() {
       ten = "Hình Chữ Nhật";
    }
   public void nhapChieuDai() {
       System.out.println("Chiếu dài = ");
       Scanner scanner = new Scanner (System.in);
    dai = scanner.nextFloat();
       scanner.close();
   }
   public void nhapChieuRong() {
       System.out. println("Chiều rộng = ");
       Scanner scanner = new Scanner(System.in);
       rong = scanner.nextFloat();
         scanner.close();
    }
   public void tinhChuvi() {
       chuVi = 2 * (dai + rong);
    }
    public void tinhDienTich() {
       dienTich = dai * rong;
    }
}
   


