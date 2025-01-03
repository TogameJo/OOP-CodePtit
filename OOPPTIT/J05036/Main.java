package J05036;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<SanPham> sp = new ArrayList<>();
        for(int i = 0;i < t;i++){
            String code = "MH"+String.format("%02d",i+1);
            String name = sc.nextLine();
            String dv = sc.nextLine();
            long gn = sc.nextLong();
            long sl = sc.nextLong();
            sc.nextLine();
            sp.add(new SanPham(code,name,dv,gn,sl));
        }
        for(SanPham res : sp){
            System.out.println(res);
        }
    }
}
/*
4
DUONG
KG
7500
150
TRUNG
CHUC
10000
225
GAO
KG
14000
118
SUA
HOP
48000
430
 */