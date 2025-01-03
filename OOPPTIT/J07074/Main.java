package J07074;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File y = new File("MONHOC.in");
        Scanner sc1 = new Scanner(y);
        ArrayList<MonHoc> mh = new ArrayList<>();
        int n = Integer.parseInt(sc1.nextLine());
        while(n --> 0){
            String code = sc1.nextLine();
            String name = sc1.nextLine();
            int tin = Integer.parseInt(sc1.nextLine());
            mh.add(new MonHoc(code,name,tin));
        }

        File x = new File("LICHGD.in");
        Scanner sc = new Scanner(x);
        ArrayList<LichGD> gd = new ArrayList<>();
        Integer t = Integer.parseInt(sc.nextLine());
        for(int i = 1;i <= t;i++){
            String mn = "HP"+String.format("%03d",i);
            String code = sc.nextLine();
            Integer thu = Integer.parseInt(sc.nextLine());
            Integer kip = Integer.parseInt(sc.nextLine());
            String name = sc.nextLine();
            String room = sc.nextLine();

            MonHoc monhoc = null;
            for(MonHoc a : mh){
                if(a.getCode().equals(code)){
                    monhoc = a;
                    break;
                }
            }
            gd.add(new LichGD(mn,code,thu,kip,name,room,monhoc));
        }
        Collections.sort(gd);
        String tv = sc.nextLine();
        String temp = "";
        for(MonHoc ans : mh){
            if(ans.getCode().equals(tv)){
                temp = ans.getName();
                break;
            }
        }
        System.out.println("LICH GIANG DAY MON "+temp+":");
        for(LichGD res : gd){
            if(res.getCode().equals(tv)){
                System.out.println(res);
            }
        }
    }
}
