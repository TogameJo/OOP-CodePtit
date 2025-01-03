package J07071;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File x = new File("DANHSACH.in");
        Scanner sc = new Scanner(x);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Ten> ten = new ArrayList<>();
        for(int i = 0;i < n;i++){
            String name = sc.nextLine();
            ten.add(new Ten(name));
        }
        Collections.sort(ten);
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < t;i++){
            String vt = sc.nextLine();
            for(Ten res : ten){
                if(res.tenvt().equals(vt)){
                    System.out.println(res);
                }
            }
        }
    }
}
