import java.util.*;
public class J04004 {
    static class phanso{
        long tu,mau;
        public void get(Scanner sc){
            tu = sc.nextLong();
            mau = sc.nextLong();
        }
    }
    public static long GCD(long a,long b){
        if(b == 0){
            return a;
        }
        return GCD(b,a%b);
    }
    static void rutgon(phanso a){
        long temp = GCD(a.tu,a.mau);
        a.tu = a.tu/temp;
        a.mau = a.mau/temp;
    }
    static phanso cong(phanso a,phanso b){
        long mc = (a.mau * b.mau)/GCD(a.mau,b.mau);
        a.tu = (mc/a.mau)*a.tu;
        b.tu = (mc/b.mau)*b.tu;
        a.tu += b.tu;
        a.mau = mc;
        rutgon(a);
        return a;
    }
    static void in(phanso a){
        System.out.println(a.tu + "/" + a.mau);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        phanso a = new phanso();
        phanso b = new phanso();
        a.get(sc);
        b.get(sc);
        phanso c = cong(a,b);
        in(c);
    }
}
