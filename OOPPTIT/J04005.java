import java.util.*;
public class J04005 {
    static class sinhvien{
        String name,date;
        double a,b,c;
        public void get(Scanner sc){
            name = sc.nextLine();
            date = sc.nextLine();
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();
        }
    }
    static void in(sinhvien s){
        double tong = s.a + s.b + s.c;
        System.out.printf("%s %s %.1f",s.name,s.date,tong);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sinhvien s = new sinhvien();
        s.get(sc);
        in(s);
        sc.close();
    }
}
