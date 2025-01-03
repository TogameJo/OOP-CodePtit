package J06003;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVienBT> svien = new ArrayList<>();
        for(int i = 1;i <= N;i++){
            String code = sc.nextLine();
            String name = sc.nextLine();
            String sdt = sc.nextLine();
            int nhom = sc.nextInt();
            sc.nextLine();
            svien.add(new SinhVienBT(code,name,sdt,nhom));
        }
        HashMap<Integer,String> mp = new HashMap<>();
        for(int i = 1; i <= M;i++){
            String name = sc.nextLine();
            mp.put(i,name);
        }

        int Q = sc.nextInt();
        sc.nextLine();
        for(int i = 0;i < Q;i++){
            int nhom = sc.nextInt();
            System.out.println("DANH SACH NHOM " + nhom + ":");
            for(SinhVienBT temp : svien){
                if(temp.getnhom() == nhom){
                    System.out.println(temp);
                }
            }
            System.out.println("Bai tap dang ky: " + mp.get(nhom));
        }
    }
}
/*
5 2
B17DTCN001
Nguyen Chi  Linh
0987345543
1
B17DTCN011
Vu Viet Thang
0981234567
1
B17DTCN023
Pham Trong Thang
0992123456
1
B17DTCN022
Nguyen Van  Quyet
0977865432
2
B17DTCN031
Ngo Thanh Vien
0912313111
2
Xay dung website ban dien thoai truc tuyen
Xay dung ung dung quan ly benh nhan Covid-19
1
1

 */