package J07058;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        File x = new File("MONHOC.in");
        Scanner sc = new Scanner(x);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> mh = new ArrayList<>();
        for(int i = 0;i < n;i++){
            String code = sc.next();
            sc.nextLine();
            String name = sc.nextLine();
            String ht = sc.nextLine();
            mh.add(new MonHoc(code,name,ht));
        }
        Collections.sort(mh);
        for(MonHoc res : mh){
            System.out.println(res);
        }
    }
}
