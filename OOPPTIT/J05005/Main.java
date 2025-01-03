package J05005;
import java.util.*;
import java.text.*;

public class Main {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien3> a = new ArrayList<>();
        for(int i = 0;i < n;i++){
            SinhVien3 s = new SinhVien3(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextDouble());
            sc.nextLine();
            a.add(s);
        }
        Collections.sort(a,SinhVien3.ss());
        for(SinhVien3 s : a){
            System.out.println(s);
        }
    }
}
