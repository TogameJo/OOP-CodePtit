package J07010;
import java.io.*;
import java.text.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws ParseException,FileNotFoundException,NumberFormatException{
        File x = new File("C:\\Users\\Lenovo\\Documents\\Ptitcode\\OOP PTIT\\OOPPTIT\\J07010\\SV.in");
        Scanner sc = new Scanner(x);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String cl = sc.nextLine();
            String date = sc.nextLine();
            double gpa = Double.parseDouble(sc.nextLine());
            SinhVien a = new SinhVien(name, cl, date, gpa);
            res.add(a);
        }
        for(SinhVien s : res){
            System.out.println(s);
        }
        sc.close();
    }
}
