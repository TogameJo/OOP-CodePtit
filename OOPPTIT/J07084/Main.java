package J07084;

import java.text.ParseException;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        File x = new File("ONLINE.in");
        Scanner sc = new Scanner(x);
        ArrayList<Online> on = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t --> 0){
            String name = sc.nextLine();
            String[] time1 = sc.nextLine().split(" ");
            String date1 = time1[0];
            String gio1 = time1[1];
            String[] time2 = sc.nextLine().split(" ");
            String date2 = time2[0];
            String gio2 = time2[1];
            on.add(new Online(name,date1,gio1,date2,gio2));
        }
        Collections.sort(on);
        for(Online res : on){
            System.out.println(res);
        }
    }
}
