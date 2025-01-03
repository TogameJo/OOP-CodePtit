package J05033;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Time> time = new ArrayList<>();
        int t = sc.nextInt();
        for(int i = 0;i < t;i++){
            int h = sc.nextInt();
            int m = sc.nextInt();
            int s = sc.nextInt();
            time.add(new Time(h,m,s));
        }
        Collections.sort(time);
        for(Time res:time){
            System.out.println(res);
        }
    }
}
/*
3
11 20 20
14 20 14
11 15 12
 */