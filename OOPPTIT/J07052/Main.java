package J07052;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        File f = new File("C:\\Users\\Lenovo\\Documents\\Ptitcode\\OOP PTIT\\OOPPTIT\\J07052\\THISINH.in");
        Scanner sc = new Scanner(f);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Diem> diem = new ArrayList<>();
        for(int i = 0;i < n;i++){
            String id = sc.next();
            sc.nextLine();
            String name = sc.nextLine();
            double toan = Double.parseDouble(sc.nextLine());
            double ly = Double.parseDouble(sc.nextLine());
            double hoa = Double.parseDouble(sc.nextLine());
            diem.add(new Diem(id,name,toan,ly,hoa));
        }
        Collections.sort(diem,Diem::compare);
        int t = Integer.parseInt(sc.nextLine());
        double diemchuan = diem.get(t-1).tongdiem()+diem.get(t-1).diemvung();
        System.out.printf("%.1f\n", diemchuan);
        for(Diem res : diem){
            if(res.tongdiem() + res.diemvung() >= diemchuan){
                System.out.println(res + " TRUNG TUYEN");
            }else{
                System.out.println(res + " TRUOT");
            }
        }
    }
}
