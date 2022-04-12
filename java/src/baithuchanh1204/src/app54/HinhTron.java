package app54;
import java.util.Scanner;
public class HinhTron extends HinhHoc {
   public float bankinh;
   public HinhTron() {
       ten = "Hinh Tròn";
    }
   public void nhapBankinh() {
       System.out.println("Bán kinh = ");
       Scanner scanner = new Scanner (System.in);
       bankinh = scanner.nextFloat();
         scanner.close();
    }
   public void tinhChuvi() {
       chuVi = 2 * PI * bankinh;
    }
   public void tinhDienTich() {
       dienTich = PI * bankinh * bankinh;
   }
}
