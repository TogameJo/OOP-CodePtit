package J05041;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<TienLuong> tl = new ArrayList<>();
        for(int i = 1;i <= t;i++){
            String code = "NV"+String.format("%02d",i);
            String name = sc.nextLine();
            long luong = sc.nextLong();
            int sn = sc.nextInt();
            sc.nextLine();
            String cv = sc.nextLine();
            tl.add(new TienLuong(code,name,luong,sn,cv));
        }
        Collections.sort(tl);
        for(TienLuong res : tl){
            System.out.println(res);
        }
    }
}
/*
3
Cao Van Vu
50000
26
GD
Do Van Truong
40000
25
PGD
Truong Thi Tu Linh
45000
22
NV
 */