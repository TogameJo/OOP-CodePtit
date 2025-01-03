package J07059;

import java.text.ParseException;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        File x = new File("CATHI.in");
        Scanner sc = new Scanner(x);
        ArrayList<Cathi> ct = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < n;i++){
            String code = "C"+String.format("%03d",i+1);
            String date = sc.nextLine();
            String time = sc.nextLine();
            String ma = sc.nextLine();
            ct.add(new Cathi(code,date,time,ma));
        }
        Collections.sort(ct);
        for(Cathi res : ct){
            System.out.println(res);
        }
    }
}
