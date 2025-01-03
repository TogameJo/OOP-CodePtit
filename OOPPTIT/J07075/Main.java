package J07075;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File x = new File("MONHOC.in");
        Scanner sc = new Scanner(x);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> mh = new ArrayList<>();
        while(t --> 0){
            String code = sc.nextLine();
            String name = sc.nextLine();
            int tc = Integer.parseInt(sc.nextLine());
            mh.add(new MonHoc(code,name,tc));
        }

        File y = new File("LICHGD.in");
        Scanner sc1 = new Scanner(y);
        int n = Integer.parseInt(sc1.nextLine());
        ArrayList<LichGD> gd = new ArrayList<>();
        for(int i = 1;i <= n;i++){
            String mn = "HP"+String.format("%03d",i);
            String code = sc1.nextLine();
            Integer thu = Integer.parseInt(sc1.nextLine());
            Integer kip = Integer.parseInt(sc1.nextLine());
            String name = sc1.nextLine();
            String room = sc1.nextLine();

            MonHoc monhoc = null;
            for(MonHoc temp : mh){
                if(temp.getCode().equals(code)){
                    monhoc = temp;
                    break;
                }
            }
            gd.add(new LichGD(mn,code,thu,kip,name,room,monhoc));
        }
        Collections.sort(gd);
        String tv = sc1.nextLine();
        System.out.println("LICH GIANG DAY GIANG VIEN "+tv+":");
        for(LichGD res : gd){
            if(res.getName().equals(tv)){
                System.out.println(res);
            }
        }
    }
}
