package J05006;
import java.util.*;
import java.text.*;

public class Main {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Nhanvien> a = new ArrayList<>();
        for(int i = 0;i < n;i++){
            Nhanvien s = new Nhanvien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            a.add(s);
        }
        for(Nhanvien s : a){
            System.out.println(s);
        }
    }
}
