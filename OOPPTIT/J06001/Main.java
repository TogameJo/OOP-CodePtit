package J06001;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<SanPham> sp = new ArrayList<>();
        for(int i = 0;i < t;i++){
            String ma = sc.nextLine();
            String name = sc.nextLine();
            long gia1 = sc.nextLong();
            long gia2 = sc.nextLong();
            sc.nextLine();
            sp.add(new SanPham(ma,name,gia1,gia2));
        }

        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<HoaDon> hd = new ArrayList<>();
        for(int i = 1;i <= n;i++){
            String code = sc.next();
            int sl = sc.nextInt();
            sc.nextLine();

            SanPham spham = null;

            for(SanPham s : sp){
                if(s.getMa().equals(code.substring(0,2))){
                    spham = s;
                    break;
                }
            }

            String mhd = code+String.format("-"+"%03d",i);
            hd.add(new HoaDon(mhd,spham,sl));
        }

        for(HoaDon res:hd){
            System.out.println(res);
        }
    }
}
/*
2
AT
Ao thun
80000
45000
QJ
Quan Jean
220000
125000
2
AT1 95
QJ2 105
 */