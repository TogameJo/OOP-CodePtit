package J07028;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File x = new File("C:\\Users\\Lenovo\\Documents\\Ptitcode\\OOP PTIT\\OOPPTIT\\J07028\\MONHOC.in");
        Scanner sc1 = new Scanner(x);
        int t = Integer.parseInt(sc1.nextLine());
        ArrayList<MonHoc> mh = new ArrayList<>();
        HashMap<String,MonHoc> mp1 = new HashMap<>();
        HashMap<String,GiangVien> mp2 = new HashMap<>();
        while(t --> 0){
            String temp[] = sc1.nextLine().split("\\s+");
            String code = temp[0];
            String name = temp[1];
            MonHoc mh1 = new MonHoc(code,name);
            mp1.put(mh1.getCode(),mh1);
        }
        File y = new File("C:\\Users\\Lenovo\\Documents\\Ptitcode\\OOP PTIT\\OOPPTIT\\J07028\\GIANGVIEN.in");
        Scanner sc2 = new Scanner(y);
        int n = Integer.parseInt(sc2.nextLine());
        ArrayList<GiangVien> gv = new ArrayList<>();
        while(n --> 0){
            String temp[] = sc2.nextLine().split("\\s+");
            String code = temp[0];
            String name = temp[1];
            GiangVien gv1 = new GiangVien(code,name);
            gv.add(gv1);
            mp2.put(gv1.getCode(),gv1);
        }

        File z = new File("C:\\Users\\Lenovo\\Documents\\Ptitcode\\OOP PTIT\\OOPPTIT\\J07028\\GioChuan.in");
        Scanner sc3 = new Scanner(z);
        int m = Integer.parseInt(sc3.nextLine());
        ArrayList<GioChuan> gc = new ArrayList<>();
        while(m --> 0){
            String temp[] = sc3.nextLine().split("\\s+");
            String codegv = temp[0];
            String codemh = temp[1];
            double gio = Double.parseDouble(temp[2]);
        }

    }
}
