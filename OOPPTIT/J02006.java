import java.util.*;

public class J02006 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[m];
        int[] b = new int[n];
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i < m;i++){
            a[i] = sc.nextInt();
            set.add(a[i]);
        }
        for(int i = 0;i < n;i++){
            b[i] = sc.nextInt();
            set.add(b[i]);
        }
        List<Integer> v = new ArrayList<>(set);
        Collections.sort(v);
        for(int x: v){
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
