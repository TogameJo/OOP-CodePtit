package J06002;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<SanPham> sp = new ArrayList<>();
        for(int i = 0;i < t;i++){
            String code = sc.nextLine();
            String name = sc.nextLine();
            long gia1 = sc.nextLong();
            long gia2 = sc.nextLong();
            sc.nextLine();

            sp.add(new SanPham(code,name,gia1,gia2));
        }

        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<HoaDon> hd = new ArrayList<>();
        for(int i = 1;i <= n;i++){
            String code = sc.next();
            int soluong = sc.nextInt();
            sc.nextLine();

            SanPham spham = null;
            for(SanPham p : sp){
                if(p.getCode().equals(code.substring(0,2))){
                    spham = p;
                    break;
                }
            }

            String mahd = code+String.format("-"+"%03d",i);
            hd.add(new HoaDon(mahd,spham,soluong));
        }

        Collections.sort(hd,HoaDon::compare);
        for(HoaDon res : hd){
            System.out.println(res);
        }
    }
}
