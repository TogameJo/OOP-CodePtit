package J07046;

import java.text.ParseException;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        File x = new File("KHACH.in");
        Scanner sc = new Scanner(x);
        ArrayList<LuuTru> date = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 0;i <t;i++){
            String mkh = "KH" + String.format("%02d",i+1);
            String name = sc.nextLine();
            String mp = sc.next();
            sc.nextLine();
            String den = sc.nextLine();
            String di = sc.nextLine();
            date.add(new LuuTru(mkh,name,mp,den,di));
        }
        Collections.sort(date);
        for(LuuTru res : date){
            System.out.println(res);
        }
    }
}
