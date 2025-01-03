package J07025;

import java.util.*;
import java.io.*;
import java.text.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException,ParseException {
        File x = new File("KHACHHANG.in");
        Scanner sc = new Scanner(x);
        ArrayList<KhachHang> kh = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 1;i <= t;i++){
            String code = "KH"+String.format("%03d",i);
            String name = sc.nextLine();
            String gen = sc.nextLine();
            String date = sc.nextLine();
            String add = sc.nextLine();
            kh.add(new KhachHang(code,name,gen,date,add));
        }
        Collections.sort(kh);
        for(KhachHang res : kh){
            System.out.println(res);
        }
    }
}
