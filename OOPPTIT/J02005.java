import java.util.*;

public class J02005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        HashMap<Integer,Boolean> mp = new HashMap<>();
        for(int i = 0;i < n;i++){
            a[i] = sc.nextInt();
            mp.put(a[i],true);
        }
        for(int i = 0;i < m;i++){
            b[i] = sc.nextInt();
        }
        HashSet<Integer> arr = new HashSet<>();
        for(int i = 0;i < m;i++){
            if(mp.containsKey(b[i])){
                arr.add(b[i]);
            }
        }
        List<Integer> list = new ArrayList<>(arr);
        Collections.sort(list);
        for(int ans : list){
            System.out.print(ans + " ");
        }
        System.out.println();
    }
}