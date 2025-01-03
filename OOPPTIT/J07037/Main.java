package J07037;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        File x = new File("DN.in");
        Scanner sc = new Scanner(x);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<DoanhNghiep> a = new ArrayList<>();
        for(int i = 0;i < n;i++){
            String ma = sc.next();
            sc.nextLine();
            String name = sc.nextLine();
            int sosinhvien = sc.nextInt();
            DoanhNghiep s = new DoanhNghiep(ma,name,sosinhvien);
            a.add(s);
        }
        Collections.sort(a,DoanhNghiep::compare);
        for(DoanhNghiep res : a){
            System.out.println(res);
        }
    }
}
