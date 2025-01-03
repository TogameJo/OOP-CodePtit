package B5;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t --> 0){
            String s = sc.nextLine();
            StringTokenizer tk = new StringTokenizer(s);
            ArrayList<String> a = new ArrayList<>();
            while(tk.hasMoreTokens()){
                a.add(tk.nextToken());
            }
            Collections.reverse(a);
            for(String res : a){
                System.out.print(res+ " ");
            }
            System.out.println();
        }
    }
}
/*
2
I like this program very much
much very program this like I
 */