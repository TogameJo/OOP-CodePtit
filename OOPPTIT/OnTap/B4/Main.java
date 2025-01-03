package B4;
import java.math.*;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            long tich = 1;
            long tong = 0;
            for(int i = 0;i < s.length();i++){
                if(i % 2 == 0){
                    if(s.charAt(i) != '0'){
                        tich *= s.charAt(i)-'0';
                    }
                }else{
                    tong += s.charAt(i)-'0';
                }
            }
            System.out.println(tich + " " + tong);
        }
    }
}
/*
3
12345678
20000
22334455667788
 */