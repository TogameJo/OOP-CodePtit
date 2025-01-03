import java.util.*;

public class J03007 {
    public static boolean stn(String s){
        int n = s.length();
        for(int i = 0;i < n/2;i++){
            if(s.charAt(i) != s.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static boolean check(String s){
        int n = s.length();
        if(s.charAt(0) != '8' && s.charAt(n-1) != '8'){
            return false;
        }
        int sum = 0;
        for(int i = 0;i < n;i++){
            sum += (s.charAt(i) - '0');
        }
        if(sum % 10 != 0){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t --> 0){
            String s = sc.nextLine();
            if(stn(s) && check(s)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
