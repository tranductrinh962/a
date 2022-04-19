package mainchild.Studentt;
public class OfflineStudent extends Student {
    public int Thoigianhoc;
    
    public OfflineStudent (int id , String ten , int tuoi , double diemtk , int Thoigianhoc){
        this.id = id;
        this.ten = ten;
        this.tuoi=tuoi;
        this.diemtk=diemtk;
        this.Thoigianhoc = Thoigianhoc;
    }
    public int getThoigianhoc(){
        return Thoigianhoc;
    }
    public void detThoigianhoc( int Thoigianhoc){
        this.Thoigianhoc=Thoigianhoc;       
    }
    @Override
    public void nhapthongtin(){
        super.nhapthongtin();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập thời gian học ");
        Thoigianhoc = sc.nextInt();
    }
    @Override
    public void inthongtin(){
        super.inthongtin();
        System.out.println("Thời gian học của sinh viên offline là : "   + Thoigianhoc);
    }
}