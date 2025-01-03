package J06006;

import java.util.*;

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
            mh.add(new MatHang(String.format("MH"+"%03d",i),name,dv,mua,ban));
        }

        int hdc = sc.nextInt();
        ArrayList<HoaDon> hd = new ArrayList<>();
        for(int i = 1;i <= hdc;i++){
            String makh = sc.next();
            String mamh = sc.next();
            int soluong = sc.nextInt();

            KhachHang khang = null;
            MatHang mhang = null;

            for(KhachHang temp1 : kh){
                if(temp1.getCode().equals(makh)){
                    khang = temp1;
                    break;
                }
            }
            for(MatHang temp2 : mh){
                if(temp2.getCode().equals(mamh)){
                    mhang = temp2;
                    break;
                }
            }

            hd.add(new HoaDon(String.format("HD"+"%03d",i),khang,mhang,soluong));
        }

        Collections.sort(hd);
        for(HoaDon res : hd){
            System.out.println(res);
        }
    }
}
/*
2
Nguyen Van Nam
Nam
12/12/1997
Mo Lao-Ha Dong-Ha Noi
Tran Van Binh
Nam
11/14/1995
Phung Khoang-Nam Tu Liem-Ha Noi
2
Ao phong tre em
Cai
25000
41000
Ao khoac nam
Cai
240000
515000
3
KH001 MH001 2
KH001 MH002 3
KH002 MH002 4
 */