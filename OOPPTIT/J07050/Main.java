package J07050;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        File f = new File("MATHANG.in");
        Scanner sc = new Scanner(f);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> mh = new ArrayList<>();
        for(int i = 1;i <= n;i++){
            String name = sc.nextLine();
            String gr = sc.nextLine();
            double mua = Double.parseDouble(sc.nextLine());
            double ban = Double.parseDouble(sc.nextLine());
            mh.add(new MatHang("MH" + String.format("%02d",i),name,gr,mua,ban));
        }

        Collections.sort(mh,MatHang::compare);
        for(MatHang res:mh){
            System.out.println(res);
        }
    }
}
