package J07003;
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        File x = new File("DATA.in");
        Scanner sc = new Scanner(x);
        while(sc.hasNext()){
            BigInteger sum = sc.nextBigInteger();
            while(sum.toString().length() > 1){
                int n = sum.toString().length();
                BigInteger a = new BigInteger(sum.toString().substring(0,n/2));
                BigInteger b = new BigInteger(sum.toString().substring(n/2,n));
                sum = a.add(b);
                System.out.println(sum);
            }
        }
        sc.close();
    }
}
