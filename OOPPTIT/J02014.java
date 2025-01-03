import java.util.*;
public class J02014 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0;i < n;i++){
                a[i] = sc.nextInt();
            }
            int i = n/2;
            int res = -1;
            while(i >= 0 && i < n){
                int sum1 = 0;
                int sum2 = 0;
                for(int j = 0;j < i;j++){
                    sum1 += a[j];
                }
                for(int k = i+1;k < n;k++){
                    sum2 += a[k];
                }
                if(sum1 == sum2){
                    res = i+1;
                    break;
                }else if(sum1 < sum2){
                    i++;
                }
                else if(sum1 > sum2){
                    i--;
                }
            }
            System.out.println(res);
        }
    }
}
