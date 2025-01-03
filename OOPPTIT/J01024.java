import java.util.*;

public class J01024 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t --> 0){
            String s = sc.nextLine();
            int n = s.length();
            boolean ok = true;
            for(int i = 0;i < n;i++){
                char c = s.charAt(i);
                if(c != '0' && c != '1' && c !='2'){
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
