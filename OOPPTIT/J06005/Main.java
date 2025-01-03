package J06005;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int khc = sc.nextInt();
        sc.nextLine();
        ArrayList<KhachHang> kh = new ArrayList<>();
        for(int i = 1;i <= khc;i++){
            String name = sc.nextLine();
            String sex = sc.nextLine();
            String date = sc.nextLine();
            String add = sc.nextLine();
            kh.add(new KhachHang(String.format("KH" + "%03d",i),name,sex,date,add));
        }
        int mhc = sc.nextInt();
        sc.nextLine();
        ArrayList<MatHang> mh = new ArrayList<>();
        for(int i = 1;i <= mhc;i++){
            String name = sc.nextLine();
            String dv = sc.nextLine();
            long mua = sc.nextLong();
            long ban = sc.nextLong();
            sc.nextLine();
            mh.add(new MatHang(String.format("MH" + "%03d",i),name,dv,mua,ban));
        }
        int hdc = sc.nextInt();
        sc.nextLine();
        ArrayList<HoaDon> hd = new ArrayList<>();
        for(int i = 1;i <= hdc;i++){
            String makh = sc.next();
            String mamh = sc.next();
            int cnt = sc.nextInt();

            KhachHang khang = null;
            MatHang mhang = null;

            for(KhachHang k : kh){
                if(k.getcode().equals(makh)){
                    khang = k;
                    break;
                }
            }

            for(MatHang m : mh){
                if(m.getcode().equals(mamh)){
                    mhang = m;
                    break;
                }
            }

            hd.add(new HoaDon(String.format("HD" + "%03d",i),khang,mhang,cnt));
        }

        for(HoaDon res : hd){
            System.out.println(res);
        }
    }
}
