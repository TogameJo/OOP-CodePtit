package J07056;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File x = new File("KHACHHANG.in");
        Scanner sc = new Scanner(x);
        ArrayList<TienDien> td = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < n;i++){
            String id = "KH"+String.format("%02d",i+1);
            String name = sc.nextLine();
            String[] a = sc.nextLine().split(" ");
            String loai = a[0];
            int dau = Integer.parseInt(a[1]);
            int cuoi = Integer.parseInt(a[2]);
            td.add(new TienDien(id,name,loai,dau,cuoi));
        }

        Collections.sort(td);
        for(TienDien res : td){
            System.out.println(res);
        }
    }
}
