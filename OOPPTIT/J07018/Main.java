package J07018;

import java.text.*;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        File x = new File("SINHVIEN.in");
        Scanner sc = new Scanner(x);
        ArrayList<SinhVien> sv = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 1;i <= t;i++){
            String code = "B20DCCN"+String.format("%03d",i);
            String name = sc.nextLine();
            String cl = sc.nextLine();
            String date = sc.nextLine();
            float gpa = Float.parseFloat(sc.nextLine());
            sv.add(new SinhVien(code,name,cl,date,gpa));
        }
        for(SinhVien res : sv){
            System.out.println(res);
        }
    }
}
