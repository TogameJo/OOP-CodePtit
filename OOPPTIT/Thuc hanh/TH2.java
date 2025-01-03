import java.util.*;
public class TH2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0;i < m;i++){
            int x = sc.nextInt();
            a.add(x);
        }
        Collections.sort(a);
        ArrayList<String> er = new ArrayList<>();
        ArrayList<String> co = new ArrayList<>();
        for(int i = 0;i < m;){
            int temp = a.get(i);
            while(Math.abs(a.get(i) - a.get(i+1)) != 1){

            }
        }
    }
}
