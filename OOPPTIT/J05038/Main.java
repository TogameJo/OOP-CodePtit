package J05038;

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
        long sum = 0;
        for(TienLuong res : tl){
            sum += res.tong();
            System.out.println(res);
        }
        System.out.println("Tong chi phi tien luong: "+sum);
    }
}
/*
5
Cao Van Vu
50000
26
GD
Bui Thi Trang
45000
23
PGD
Do Van Truong
40000
25
PGD
Nguyen Van Cam
37000
26
TP
Truong Thi Tu Linh
45000
22
NV
 */