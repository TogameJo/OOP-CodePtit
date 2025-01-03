import java.util.*;
public class J03040 {
    public static boolean check1(String s){
        for(int i = 5;i < 7;i++){
            if(s.charAt(i) >= s.charAt(i+1)){
                return false;
            }
        }
        if(s.charAt(9) <= s.charAt(7)){
            return false;
        }
        if(s.charAt(9) >= s.charAt(10)){
            return false;
        }
        return true;
    }
    public static boolean check2(String s){
        for(int i = 5;i < 7; i++){
            if(s.charAt(i) != s.charAt(i+1)){
                return false;
            }
        }
        if(s.charAt(9) != s.charAt(10)){
            return false;
        }
        return true;
    }
    public static boolean check4(String s){
        for(int i = 5;i < 8;i++){
            if(s.charAt(i) != '6' && s.charAt(i) != '8'){
                return false;
            }
        }
        for(int i = 9;i < s.length();i++){
            if(s.charAt(i) != '6' && s.charAt(i) != '8'){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            if(check1(s) || check2(s) || check4(s)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
