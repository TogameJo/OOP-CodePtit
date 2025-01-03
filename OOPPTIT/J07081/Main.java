package J07081;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File x = new File("SINHVIEN.in");
        Scanner sc = new Scanner(x);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> sv = new ArrayList<>();
        while(t --> 0){
            String code = sc.nextLine();
            String name = sc.nextLine();
            String sdt = sc.nextLine();
            String em = sc.nextLine();
            sv.add(new SinhVien(code,name,sdt,em));
        }
        Collections.sort(sv);
        for(SinhVien res : sv){
            System.out.println(res);
        }
    }
}
