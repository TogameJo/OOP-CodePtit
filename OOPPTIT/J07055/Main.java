package J07055;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("BANGDIEM.in");
        Scanner sc = new Scanner(f);
        ArrayList<BangDiem> bd = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= t; i++) {
            String name = sc.nextLine();
            double d1 = Double.parseDouble(sc.nextLine());
            double d2 = Double.parseDouble(sc.nextLine());
            double d3 = Double.parseDouble(sc.nextLine());
            bd.add(new BangDiem("SV" + String.format("%02d", i), name, d1, d2, d3));
        }
        Collections.sort(bd);
        for (BangDiem res : bd) {
            if (res.diemchuan() >= 8) {
                System.out.println(res + " GIOI");
            } else if (res.diemchuan() >= 6.5) {
                System.out.println(res + " KHA");
            } else if (res.diemchuan() >= 5) {
                System.out.println(res + " TRUNG BINH");
            } else {
                System.out.println(res + " KEM");
            }
        }
    }
}
