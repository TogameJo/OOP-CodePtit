import java.util.*;
public class J04002 {
    static String st(String  s){
        if(s.length() == 1){
            return ""+ Character.toUpperCase(s.charAt(0));
        }
        s = s.toLowerCase();
        return ""+ Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String c = sc.next();
        if(a > 0 && b > 0){
            System.out.printf("%d %d %s",(a+b)*2, a*b, st(c));
        }else System.out.println("INVALID");
    }
}
