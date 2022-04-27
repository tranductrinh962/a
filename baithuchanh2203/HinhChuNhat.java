package baithuchanh2203;
import java.util.Scanner;
public class HinhChuNhat {
    public static void main(String[] args) throws Exception {
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.NhapKichThuocHCN();
        hcn.tinhChuVi();
        hcn.tinhDienTich();
        hcn.inChuVi();
        hcn.inDienTich();
    }

    public float d, r, cv, dt;
    Scanner scanner = new Scanner(System.in);

    public void NhapKichThuocHCN() {
        System.out.println("Hay nhap chieu dai: ");
        d = scanner.nextFloat();
        System.out.println("Hay nhap chieu rong: ");
        r = scanner.nextFloat();
    }


    void tinhChuVi() {
        cv = (d + r) * 2;
    }

    void tinhDienTich() {
        dt = d * r;
    }

    void inChuVi() {
        System.out.println("Chu vi Hinh Chu Nhat: " + cv);
    }

    void inDienTich() {
        System.out.println("Dien tich Hinh Chu Nhat : " + dt);
    }
}
