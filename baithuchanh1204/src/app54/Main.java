package app54;

public class Main {
    public static void main(String[] args) {
       
        HinhTron hinhTron = new HinhTron();
        hinhTron.xuatTen();
        hinhTron.nhapBankinh();
        hinhTron.tinhChuvi ();
        hinhTron.tinhDienTich();
        hinhTron.inDienTich();
     
        HinhTru hinhTru = new HinhTru();
        hinhTru.xuatTen();
        hinhTru.nhapChieucao();
        hinhTru.tinhTheTich();
        hinhTru.inTheTich();
      
        HinhChuNhat hinhChuNhat = new HinhChuNhat();
        hinhChuNhat.xuatTen();
        hinhChuNhat.nhapChieuDai();
        hinhChuNhat.nhapChieuRong ();
        hinhChuNhat.tinhChuvi();
        hinhChuNhat.tinhDienTich();
        hinhChuNhat.inChuvi();
        hinhChuNhat.inDienTich();
      
        HinhVuong hinhVuong = new HinhVuong();
        hinhVuong.xuatTen();
        hinhVuong.nhapCanh();
        hinhVuong.tinhChuvi();
        hinhVuong.tinhDienTich();
        hinhVuong.inChuvi();
        hinhVuong.inDienTich();
    }
}  

