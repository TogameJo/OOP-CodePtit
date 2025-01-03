package baitoanbanhang;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException,NumberFormatException{
        Scanner sc = new Scanner(new File("KH.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> a= new ArrayList<>();
        for(int i = 1;i <= t;i++){
            String name = sc.nextLine();
            String sex = sc.nextLine();
            String date = sc.nextLine();
            String add = sc.nextLine();
            a.add(new KhachHang(String.format("KH" + "%03d",i),name,sex,date,add));
        }

        Scanner sc1 = new Scanner(new File("MH.in"));
        int n = Integer.parseInt(sc1.nextLine());
        ArrayList<MatHang> b = new ArrayList<>();
        for(int i = 1;i <= n;i++){
            String name = sc1.nextLine();
            String dv = sc1.nextLine();
            Long mua = Long.parseLong(sc1.nextLine());
            Long ban = Long.parseLong(sc1.nextLine());
            b.add(new MatHang(String.format("MH" + "%03d",i),name,dv,mua,ban));
        }

        Scanner sc2 = new Scanner(new File("HD.in"));
        int m = Integer.parseInt(sc2.nextLine());
        ArrayList<HoaDon> c = new ArrayList<>();
        for(int i = 1;i <= m;i++){
            String[] line = sc2.nextLine().split(" ");
            String makh = line[0];
            String mamh = line[1];
            int soluong = Integer.parseInt(line[2]);
            KhachHang kh = null;
            MatHang mh = null;
            for(KhachHang k : a ){
                if(k.getcode().equals(makh)){
                    kh = k;
                    break;
                }
            }
            for(MatHang mha : b){
                if(mha.getcode().equals(mamh)){
                    mh = mha;
                     break;
                }
            }
            c.add(new HoaDon(String.format("HD"+"%03d",i),kh,mh,soluong));
        }
        for(HoaDon res : c){
            System.out.println(res);
        }
    }
}
