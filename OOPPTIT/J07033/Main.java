package J07033;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        File x = new File("SINHVIEN.in");
        Scanner sc = new Scanner(x);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> a = new ArrayList<>();
        for(int i = 0;i < t;i++){
            String msv = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            SinhVien s = new SinhVien(msv,name,lop,email);
            a.add(s);
        }
        Collections.sort(a,SinhVien::compare);
        for(SinhVien res : a){
            System.out.println(res);
        }
    }
}
