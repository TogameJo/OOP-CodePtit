package J07073;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File x = new File("MONHOC.in");
        Scanner sc = new Scanner(x);
        ArrayList<MonHoc> mh = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t --> 0){
            String code = sc.nextLine();
            String name = sc.nextLine();
            int tc = Integer.parseInt(sc.nextLine());
            String lt = sc.nextLine();
            String th = sc.nextLine();
            mh.add(new MonHoc(code,name,tc,lt,th));
        }
        Collections.sort(mh);
        for(MonHoc res : mh){
            if(!res.getTh().equals("Truc tiep")){
                System.out.println(res);
            }
        }
    }
}
