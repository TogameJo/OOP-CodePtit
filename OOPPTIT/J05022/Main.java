package J05022;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> sv = new ArrayList<>();
        while(t --> 0){
            String code = sc.nextLine();
            String name = sc.nextLine();
            String cl = sc.nextLine();
            String em = sc.nextLine();
            sv.add(new SinhVien(code,name,cl,em));
        }
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0;i < n;i++){
            String q = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP "+q+":");
            for(SinhVien res : sv){
                if(res.getCl().equals(q)){
                    System.out.println(res);
                }
            }
        }
    }
}
/*
4
B16DCCN011
Nguyen Trong Duc Anh
D16CNPM1
sv1@stu.ptit.edu.vn
B15DCCN215
To Ngoc Hieu
D15CNPM3
sv2@stu.ptit.edu.vn
B15DCKT150
Nguyen Ngoc Son
D15CQKT02-B
sv3@stu.ptit.edu.vn
B15DCKT199
Nguyen Trong Tung
D15CQKT02-B
sv4@stu.ptit.edu.vn
1
D15CQKT02-B
 */