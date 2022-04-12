package app79;

public class Sep extends NhanVien{
    private int gioLamViec;

public Sep(String ten, int gioLamViec){
    this.ten=ten;
    this.gioLamViec=gioLamViec;
   
}
@Override
public String loaiNhanVien(){
    return "sep";
}
public void tinhLuong(){
    luong= configs.LUONG_FULL_TIME_SEP * gioLamViec;
}
}