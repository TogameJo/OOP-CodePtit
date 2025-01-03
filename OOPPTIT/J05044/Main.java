package J05044;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<NhanVien> a = new ArrayList<>();
        while(t --> 0){
            String name = sc.nextLine();
            String cv = sc.nextLine();
            long lcb = sc.nextLong();
            long snc = sc.nextLong();
            sc.nextLine();
            a.add(new NhanVien(name,cv,lcb,snc));
        }
        String ans = sc.nextLine();
        for(NhanVien res : a){
            if(res.getCv().equals(ans)){
                System.out.println(res);
            }
        }
    }
}
/*
4
Tran Thi Yen
NV
1000
24
Nguyen Van Thanh
BV
1000
30
Doan Truong An
TP
3000
25
Le Thanh
GD
5000
28
TP
 */
