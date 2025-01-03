import java.util.*;
public class J04003 {
    static class ps{
        long tu,mau;
        public void get(Scanner sc){
            tu =sc.nextLong();
            mau = sc.nextLong();
        }
    }
    public static long GCD(long a,long b){
        if(b == 0){
            return a;
        }
        return GCD(b,a%b);
    }
    static void rutgon(ps a){
        long temp = GCD(a.tu,a.mau);
        a.tu = a.tu/temp;
        a.mau = a.mau/temp;
    }
    static void in(ps a){
        System.out.println(a.tu + "/" + a.mau);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ps a = new ps();
        a.get(sc);
        rutgon(a);
        in(a);
        sc.close();
    }
}
