import java.util.*;
public class J02034 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        HashMap<Integer,Boolean> mp = new HashMap<>();
        for(int i = 0;i < n;i++){
            a[i] = sc.nextInt();
            mp.put(a[i],true);
        }
        Arrays.sort(a);
        int min = a[0];
        int max = a[n-1];
        List<Integer> v = new ArrayList<>();
        int ok = 1;
        for(int i = 1;i <= max;i++){
            if(!mp.containsKey(i)){
                v.add(i);
                ok = 0;
            }
        }
        if(ok==1){
            System.out.println("Excellent!");
        }else{
            for(int x : v){
                System.out.println(x);
            }
        }
    }
}
