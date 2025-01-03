package J05004;
import java.util.*;
import java.text.*;

public class Main {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien2> a = new ArrayList<>();
        for(int i = 0;i < n;i++){
            SinhVien2 s = new SinhVien2(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextDouble());
            sc.nextLine();
            a.add(s);
        }
        for(SinhVien2 s : a){
            System.out.println(s);
        }
    }
}
