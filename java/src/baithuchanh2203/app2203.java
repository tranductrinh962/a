package baithuchanh2203;
public class app2203 {
    private static String cv;
    private static String dt;

    public static void main(String[] args) throws Exception {
        System.out.println("Bai_1 : HCN");
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.NhapKichThuocHCN();
        hcn.tinhChuVi();
        hcn.tinhDienTich();
        hcn.inChuVi();
        hcn.inDienTich();
        System.out.println("chu vi hcn la: "  +cv);
        System.out.println("Dien tich Hinh Chu Nhat : " + dt);
        
        System.out.println("Bai_2: Person");
        person ps = new person();
        ps.nhapPersonName();
        ps.nhapPersonID();
        ps.nhapGender();
        ps.nhapAddress();
        ps.inThongTin();
        
        System.out.println("Bai_3: SinhVien");
        sinhvien sv = new sinhvien();
        
        sv.nhapdulieu();
        sv.inDiaChi();
        sv.inHoTen();
        sv.inMaSinhVien();
        sv.inNgaySinh();
        sv.ingioiTinh();
        
        System.out.println("Bai_4: PT bac 2");
        Phuongtrinhbachai pt = new Phuongtrinhbachai();
        pt.nhapsolieu();
        pt.tinhdelta();
        pt.indelta();
        pt.giaiptb2();

    }
}