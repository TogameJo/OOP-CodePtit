package J05021;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> sv = new ArrayList<>();
        while(sc.hasNextLine()){
            String code = sc.nextLine();
            String name = sc.nextLine();
            String cl = sc.nextLine();
            String em = sc.nextLine();
            sv.add(new SinhVien(code,name,cl,em));
        }
        Collections.sort(sv);
        for(SinhVien res : sv){
            System.out.println(res);
        }
    }
}
/*
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
D15CQKT03-B
sv4@stu.ptit.edu.vn
 */
