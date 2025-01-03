package J05009;
import java.util.*;
import java.text.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<ThiSinh> ts = new ArrayList<>();
        for(int i = 0;i < n;i++){
            String name = sc.nextLine();
            String date = sc.nextLine();
            double a = Double.parseDouble(sc.nextLine());
            double b = Double.parseDouble(sc.nextLine());
            double c = Double.parseDouble(sc.nextLine());
            ts.add(new ThiSinh(name,date,a,b,c));
        }
        Collections.sort(ts);
        double max = ts.get(0).tongdiem();
        for(ThiSinh res : ts){
            if(res.tongdiem() >= max){
                System.out.println(res);
            }
        }
    }
}
