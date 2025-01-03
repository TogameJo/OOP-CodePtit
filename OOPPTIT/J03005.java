import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class J03005 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            s = s.toLowerCase();
            StringTokenizer tk = new StringTokenizer(s);
            StringBuilder res = new StringBuilder();
            ArrayList<String> word = new ArrayList<>();
            while(tk.hasMoreTokens()){
                word.add(tk.nextToken());
            }
            int n = word.size();
            String temp = word.get(0);
            for(int i = 1;i < n;i++){
                if(i > 1){
                    res.append(" ");
                }
                String ans = word.get(i);
                res.append(Character.toUpperCase(ans.charAt(0)));
                res.append(ans.substring(1));
            }
            res.append(", ");
            res.append(temp.toUpperCase());
            System.out.println(res);
        }
        sc.close();
    }
}
