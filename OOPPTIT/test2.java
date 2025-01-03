import java.util.*;

public class test2 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            Stack<String> st = new Stack<>();
            StringTokenizer tk = new StringTokenizer(s);
            while(tk.hasMoreTokens()){
                st.push(tk.nextToken());
            }
            while(!st.empty()){
                System.out.print(st.pop() + " ");
            }
            System.out.println();
        }
    }
}
