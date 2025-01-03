import java.util.*;
public class J02004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0;i < n;i++){
                a[i] = sc.nextInt();
            }
            boolean ok = true;
            for(int i = 0;i < a.length/2;i++){
                if(a[i] != a[a.length-i-1]){
                    ok = false;
                }
            }
            if(ok){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
