package app54;
import java.util.Scanner;
public class HinhTru extends HinhTron {
    public float chieuCao;
    public HinhTru() {
        ten = "Hình Trụ";
    }
    public void nhapChieucao() {
        nhapBankinh();
        System.out.println("Chiều cao = ");
        Scanner scanner = new Scanner(System.in);
        chieuCao = scanner.nextFloat();
        scanner.close();
    }
   public void tinhTheTich() {
        tinhDienTich();
        theTich = dienTich * chieuCao;
   }
}

