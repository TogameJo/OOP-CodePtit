import java.util.*;
public class J01017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            int n = s.length();
            boolean ok = true;
            for(int i = 0; i < n-1; i++) {
                int x = s.charAt(i) - '0';
                int y = s.charAt(i+1) - '0';
                if(Math.abs(y-x) != 1){
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
