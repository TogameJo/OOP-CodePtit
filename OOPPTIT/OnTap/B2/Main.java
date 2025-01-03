package B2;
import java.text.ParseException;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            ArrayList<String> chu = new ArrayList<>();
            ArrayList<Integer> so = new ArrayList<>();
            for(int i = 0;i < s.length();i++){
                if(Character.isDigit(s.charAt(i))){
                    so.add(Integer.parseInt(String.valueOf(s.charAt(i))));
                }else{
                    chu.add(String.valueOf(s.charAt(i)));
                }
            }
            int sum = 0;
            for(int i : so){
                sum += i;
            }
            Collections.sort(chu);
            for(String res : chu){
                System.out.print(res);
            }
            System.out.println(sum);
        }
    }
}
/*
2
AC2BEW3
ACCBA10D2EW30
 */