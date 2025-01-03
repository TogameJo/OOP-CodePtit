package J07020;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File x = new File("KH.in");
        Scanner sc = new Scanner(x);
        int a = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> kh = new ArrayList<>();
        for(int i = 1;i <= a;i++){
            String idkh = "KH"+String.format("%03d",i);
            String name = sc.nextLine();
            String sex = sc.nextLine();
            String date = sc.nextLine();
            String add = sc.nextLine();
            kh.add(new KhachHang(idkh,name,sex,date,add));
        }
        File y = new File("MH.in");
        Scanner sc1 = new Scanner(y);
        int b = Integer.parseInt(sc1.nextLine());
        ArrayList<MatHang> mh = new ArrayList<>();
        for(int i = 1;i <= b;i++){
            String idmh = "MH"+String.format("%03d",i);
            String name = sc1.nextLine();
            String dv = sc1.nextLine();
            long mua = Long.parseLong(sc1.nextLine());
            long ban = Long.parseLong(sc1.nextLine());
            mh.add(new MatHang(idmh,name,dv,mua,ban));
        }
        File z = new File("HD.in");
        Scanner sc2 = new Scanner(z);
        int c = Integer.parseInt(sc2.nextLine());
        ArrayList<HoaDon> hd = new ArrayList<>();
        for(int i = 1;i <= c;i++){
            String[] temp = sc2.nextLine().split("\\s+");
            String idhd = "HD"+String.format("%03d",i);
            String idkh = temp[0];
            String idmh = temp[1];
            int sl = Integer.parseInt(temp[2]);

            KhachHang khang = null;
            MatHang mhang = null;

            for(KhachHang j : kh){
                if(j.getIdkh().equals(idkh)){
                    khang = j;
                    break;
                }
            }

            for(MatHang j : mh){
                if(j.getIdmh().equals(idmh)){
                    mhang = j;
                }
            }

            hd.add(new HoaDon(idhd,sl,khang,mhang));
        }
        for(HoaDon res : hd){
            System.out.println(res);
        }
    }
}
