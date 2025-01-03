package J05007;
import java.util.*;
import java.text.*;

public class Main {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<NhanVien> a = new ArrayList<>();
        for(int i = 0;i < n;i++){
            NhanVien s = new NhanVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            a.add(s);
        }
        Collections.sort(a, NhanVien.ss());
        for(NhanVien s : a){
            System.out.println(s);
        }
    }
}
