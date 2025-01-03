import  java.util.*;
public class J01013 {
    public static int check(int n) {
        if(n<=1) return n;
        int tmp = 0;
        for(int i = 2; i*i <= n; i++){
            while (n%i == 0){
                tmp += i;
                n /= i;
            }
        }
        if(n != 1) tmp += n;
        return tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            res += check(a);
        }
        System.out.println(res);
    }
}
