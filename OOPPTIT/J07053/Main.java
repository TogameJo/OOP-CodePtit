package J07053;

import java.text.ParseException;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException{
        File f = new File("C:\\Users\\Lenovo\\Documents\\Ptitcode\\OOP PTIT\\OOPPTIT\\J07053\\XETTUYEN.in");
        Scanner sc = new Scanner(f);
        ArrayList<ThiSinh> ts = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1;i <= n;i++){
            String name = sc.nextLine();
            String date = sc.next();
            sc.nextLine();
            double lt = Double.parseDouble(sc.nextLine());
            double th = Double.parseDouble(sc.nextLine());
            ts.add(new ThiSinh("PH"+String.format("%02d",i),name,date,lt,th));
        }
        for(ThiSinh res : ts){
            if(res.diemxet() >= 9){
                System.out.println(res + " Xuat sac");
            }else if(res.diemxet() == 8){
                System.out.println(res + " Gioi");
            }else if(res.diemxet() == 7){
                System.out.println(res + " Kha");
            }else if(res.diemxet() >= 5){
                System.out.println(res + " Trung binh");
            }else{
                System.out.println(res + " Truot");
            }
        }
    }
}
