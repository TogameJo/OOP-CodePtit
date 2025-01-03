import java.util.*;
public class TH1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Double> a = new ArrayList<>();
        for(int i = 0;i < n;i++){
            double x = sc.nextDouble();
            a.add(x);
        }
        double max = Collections.max(a);
        double min = Collections.min(a);
        ArrayList<Double> res = new ArrayList<>();
        for(int i = 0;i < n;i++){
            if(a.get(i) != max && a.get(i) != min){
                res.add(a.get(i));
            }
        }
        double sum = 0;
        for(int i = 0;i < res.size();i++){
            sum += res.get(i);
        }
        System.out.printf("%.2f",sum/res.size());
    }
}
