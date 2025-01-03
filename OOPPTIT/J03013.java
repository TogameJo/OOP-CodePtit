import java.util.*;
import java.math.*;

public class J03013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            String ans = a.subtract(b).abs().toString();  //tao chuoi ket qua a - b
            int max = Math.max(a.toString().length(), b.toString().length());   //so sanh do dai 2 so nguyen lon
            while(ans.length()<max) ans = "0" + ans;
            System.out.println(ans);
        }
    }
}
