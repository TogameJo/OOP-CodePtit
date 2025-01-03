import java.util.*;
public class test3 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int x;
            TreeSet<Integer> st1 = new TreeSet<>();
            TreeSet<Integer> st2 = new TreeSet<>();
            for(int i = 0;i < n;i++) {
                x = sc.nextInt();
                if (x % 2 == 0) {
                    st1.add(x);
                } else {
                    st2.add(x);
                }
            }
            ArrayList<Integer> res2 = new ArrayList<>(st2);
            Collections.reverse(res2);
            for(int even : st1){
                System.out.print(even + " ");
            }
            System.out.println();
            for(int odd : res2){
                System.out.print(odd + " ");
            }
            System.out.println();
        }
    }
}
