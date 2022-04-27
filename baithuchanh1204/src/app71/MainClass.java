package app71;

public class MainClass {
    public static void main(String[] args) {
         HinhTron hinhTron = new HinhTron();
         hinhTron.setBankinh(10);
         float chuvi = hinhTron.tinhChuVi();
         float dienTich = hinhTron.tinhDienTich();
         System.out.println("Chu vi hình tròn: "+ chuvi + "; Và diện tích: "+ dienTich);
    }
}