import java.util.Scanner;

public class J01004 {
    public static boolean check(int n){
        for(int i = 2;i*i <= n;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            if(check(a)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
