import java.util.*;

public class J03006 {
    public static boolean stn(String n){
        for(int i = 0;i < n.length()/2;i++){
            if(n.charAt(i) != n.charAt(n.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static boolean chan(String n){
        for(int i = 0;i < n.length();i++){
            if((n.charAt(i)-'0') % 2 != 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            if (stn(s) && chan(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
