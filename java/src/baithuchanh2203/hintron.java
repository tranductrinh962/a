package baithuchanh2203;
import java.util.Scanner;
public class hintron {
    final float PI =  3.14f;
        float r;
        float chuvi;
        float dientich;
    
        void nhapBankinh(){
            System.out.println("Hay nhap ban kinh hinh tron: ");
            Scanner sc = new Scanner(System.in);
            r = sc.nextFloat(); 
            sc.close();
        }
        void tinhChuVi(){
            chuvi = 2* PI *r ;
           }
        void tinhDienTich(){
        dientich = PI * r* r;
           }
        void inChuvi(){
        System.out.println("Chu vi hinh tron : " +chuvi);
        }
        void inDientich(){
           System.out.println("Dien tich hinh tron: " + dientich);
        }
}

