package J05027;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<Gvien> gv = new ArrayList<>();
        for(int i = 1;i <= t;i++){
            String code = "GV" + String.format("%02d",i);
            String name = sc.nextLine();
            String mh = sc.nextLine();
            gv.add(new Gvien(code,name,mh));
        }
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0;i < n;i++){
            String s = sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA "+s+":");
            for(Gvien res : gv){
                if(res.getName().toLowerCase().contains(s.toLowerCase())){
                    System.out.println(res);
                }
            }
        }
    }
}
/*
3
Nguyen Manh Son
Cong nghe phan mem
Vu Hoai Nam
Khoa hoc may tinh
Dang Minh Tuan
An toan thong tin
1
aN
 */