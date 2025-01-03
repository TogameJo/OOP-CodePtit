import java.util.*;
public class J02022 {
    public static boolean check(String s){
        for(int i = 0;i < s.length();i++){
            if(i == '0'){
                return false;
            }
        }
        for(int j = 0;j < s.length();j++){
            int x = s.charAt(j) - '0';
            int y = s.charAt(j+1) - '0';
            if(Math.abs(x-y) == 1){
                return false;
            }
        }
        return true;
    }
    public static boolean check1(int s,String res){
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i = 0;i < s;i++){
            if(mp.containsKey(i)){
                mp.put(i,mp.get(i)+1);
            }else{
                mp.put(i,1);
            }
        }
        for(int j = 0;j < res.length();j++){
            if(mp.get(res.charAt(j)) != 1){
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
            String n = sc.nextLine();
            if(check(n)){
                System.out.println();
            }
        }
    }
}
