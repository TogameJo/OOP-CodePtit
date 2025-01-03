import java.util.*;

public class J02007 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j = 1;j <= t;j++){
            int n = sc.nextInt();
            int[] a = new int[n];
            LinkedHashMap<Integer,Integer> mp = new LinkedHashMap<>();
            LinkedHashSet<Integer> set = new LinkedHashSet<>();
            for(int i = 0;i < n;i++){
                a[i] = sc.nextInt();
                set.add(a[i]);
            }
            int cnt = 0;
            for(int i = 0;i < n;i++){
                if(mp.containsKey(a[i])){
                    mp.put(a[i],mp.get(a[i])+1);
                }else{
                    mp.put(a[i],1);
                }
            }
            ArrayList<Integer> v = new ArrayList<>(set);
            System.out.println("Test "+j+":");
            for(int i = 0;i < v.size();i++){
                System.out.println(v.get(i) + " xuat hien "+mp.get(v.get(i)) + " lan");
            }
        }
    }
}
