package J07048;

import java.util.*;
import java.io.*;
import java.text.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        File x = new File("SANPHAM.in");
        Scanner sc = new Scanner(x);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SanPham> sp = new ArrayList<>();
        for(int i = 0;i < t;i++){
            String msp = sc.next();
            sc.nextLine();
            String name = sc.nextLine();
            int gia = sc.nextInt();
            int bh = sc.nextInt();
            sp.add(new SanPham(msp,name,gia,bh));
        }
        Collections.sort(sp,SanPham::compare);
        for(SanPham res : sp){
            System.out.println(res);
        }
    }
}
