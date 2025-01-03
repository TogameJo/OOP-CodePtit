package J07051;

import java.text.ParseException;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        File x = new File("KHACHHANG.in");
        Scanner sc = new Scanner(x);
        ArrayList<KhachHang> kh = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < n;i++){
            String id = "KH" + String.format("%02d",i+1);
            String name = sc.nextLine();
            String sp = sc.nextLine();
            String ngaynhan = sc.nextLine();
            String ngaytra = sc.nextLine();
            int tien = Integer.parseInt(sc.nextLine());
            kh.add(new KhachHang(id,name,sp,ngaynhan,ngaytra,tien));
        }
        Collections.sort(kh);
        for(KhachHang res : kh){
            System.out.println(res);
        }
    }
}
