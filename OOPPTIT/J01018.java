import java.util.*;
public class J01018 {
    public static boolean check(String s){
        int n = s.length();
        int sum = 0;
        for(int i = 0;i < n;i++){
            int a = s.charAt(i) - '0';
            sum += a;
        }
        if(sum % 10 == 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            boolean ok = true;
            for(int i = 0;i < s.length()-1;i++){
                int a = s.charAt(i) - '0';
                int b = s.charAt(i+1) - '0';
                if(Math.abs(a-b) != 2){
                    ok = false;
                    break;
                }
            }
            if(ok && check(s)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
