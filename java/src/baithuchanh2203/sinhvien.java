package baithuchanh2203;
import java.sql.Date;
import java.util.Scanner;

public class sinhvien {
    String MaSinhVien, HoTen, Gt, DiaChi, Ns;
    Boolean GioiTinh;
    Date NgaySinh;
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên: ");
        MaSinhVien = sc.nextLine();
        System.out.println("Nhập họ và tên sinh viên: ");
        HoTen = sc.nextLine();
        System.out.println("Nhập giới tính: ");
        Gt = sc.nextLine();
        if(Gt == "nam") {
            GioiTinh = true;
        }else{
            GioiTinh = false;
        }
        System.out.println("Nhập địa chỉ: ");
        DiaChi = sc.nextLine();
        System.out.println("Nhập ngày sinh: ");
        Ns = sc.nextLine();
        sc.close();
    }
    public void inThongTin() {
        System.out.println("Thông tin người dùng:\n");
        System.out.println("ID: " + MaSinhVien);
        System.out.println("Tên: " + HoTen);
        if(GioiTinh == false){
            System.out.println("Giới tính: Nam");
        }else{
            System.out.println("Giới tính: Nữ");
        }
        System.out.println("Địa chỉ: " + DiaChi);
        System.out.println("Ngày sinh: " + Ns);
    }
}