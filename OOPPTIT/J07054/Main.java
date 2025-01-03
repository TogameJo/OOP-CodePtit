package J07054;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        File f = new File("BANGDIEM.in");
        Scanner sc = new Scanner(f);
        ArrayList<BangDiem> bd = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 1;i <= t;i++){
            String name = sc.nextLine();
            double d1 = Double.parseDouble(sc.nextLine());
            double d2 = Double.parseDouble(sc.nextLine());
            double d3 = Double.parseDouble(sc.nextLine());
            bd.add(new BangDiem("SV"+String.format("%02d",i),name,d1,d2,d3));
        }
        Collections.sort(bd,BangDiem::compare);

        int rank = 1;
        for(int i = 0;i < bd.size();i++){
            if(i > 0 && bd.get(i).diemchuan() == bd.get(i - 1).diemchuan()){
                System.out.println(bd.get(i) + " " + (rank));
            }else {
                rank = i + 1;
                System.out.println(bd.get(i) + " " + rank);
            }
        }
    }
}
