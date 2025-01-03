import java.util.Scanner;

public class J01006 {
    public static int fibo(int n) {
        if(n == 1 || n == 2){
            return 1;
        }else{
            return fibo(n-1) + fibo(n-2);
        }
    }
    public static boolean check(int x){
        int i = 1;
        int fi = fibo(i);
        while(i <= x){
            if(fi == x){
                return true;
            }
            i++;
            fi = fibo(i);
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            if(check(n)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
