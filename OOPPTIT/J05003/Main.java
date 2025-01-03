package J05003;
import java.util.*;
import java.text.*;

public class Main {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien1> a = new ArrayList<>();
        for(int i = 0;i < n;i++){
            SinhVien1 s = new SinhVien1(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextDouble());
            sc.nextLine();
            a.add(s);
        }
        for(SinhVien1 s : a){
            System.out.println(s);
        }
    }
}
