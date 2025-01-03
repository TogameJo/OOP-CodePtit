package J02104;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[][] a = new int[m][m];
        for(int i = 1;i <= m;i++){
            for(int j = 1;j <= m;j++){
                int x = sc.nextInt();
                if(x == 1 && i < j){
                    System.out.println("(" +i+","+j+")");
                }
            }
        }
    }
}
