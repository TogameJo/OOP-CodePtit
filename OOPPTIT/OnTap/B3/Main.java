package B3;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            long a = sc.nextLong();
            long ans = 0;
            for(long i = 2;i*i <= a;i++){
                if(a % i == 0){
                    ans = i;
                    while(a % i == 0){
                        a /= i;
                    }
                }
            }
            if(a > 1){
                ans = a;
            }
            System.out.println(ans);
        }
    }
}
/*
2
315
31
 */