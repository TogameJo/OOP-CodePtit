package J07057;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        File x = new File("THISINH.in");
        Scanner sc = new Scanner(x);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<TuyenSinh> ts = new ArrayList<>();
        for(int i = 0;i < n;i++){
            String code = "TS" + String.format("%02d",i+1);
            String name = sc.nextLine();
            double dthi = Double.parseDouble(sc.nextLine());
            String dt = sc.next();
            sc.nextLine();
            int kv = Integer.parseInt(sc.nextLine());
            ts.add(new TuyenSinh(code,name,dthi,dt,kv));
        }
        Collections.sort(ts);
        for(TuyenSinh res : ts){
            if(res.diemchuan() >= 20.5){
                System.out.println(res + " Do");
            }else{
                System.out.println(res + " Truot");
            }
        }
    }
}
