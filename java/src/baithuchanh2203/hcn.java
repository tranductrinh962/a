package baithuchanh2203;
import java.util.Scanner;
public class hcn {
    public static Scanner sc = new Scanner(System.in);
        float chieudai,chieurong,chuvi,dientich;
       void nhapChieudai(){
           System.out.print("Chieu dai la : ");
           chieudai = sc.nextFloat();
       }
       void nhapChieurong(){
          System.out.print("nhap chieu rong: ");
          chieurong = sc.nextFloat();
       }
       float tinhChuvi(){
           chuvi = (chieudai+chieurong)*2;
            return chuvi;
       }
        float tinhDientich(){
           dientich = chieudai*chieurong;
            return dientich;
        }
       void inChuvi(){
           System.out.println("Chu vi la :" +chuvi);
       }
         void indientich(){
           System.out.println("Dien tich la :" +dientich);
       }
    
}

