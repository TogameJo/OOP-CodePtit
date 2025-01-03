package J05069;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<CLB> clb = new ArrayList<>();
        while(t --> 0){
            String code = sc.nextLine();
            String name = sc.nextLine();
            int gv = sc.nextInt();
            sc.nextLine();
            clb.add(new CLB(code,name,gv));
        }
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<TranDau> td = new ArrayList<>();
        while(n --> 0){
            String[] temp = sc.nextLine().split("\\s+");
            String code = temp[0];
            String ma = code.substring(1,3);
            long gv = Long.parseLong(temp[1]);
            CLB club = null;
            for(CLB i : clb){
                if(i.getCode().equals(ma)){
                    club = i;
                    break;
                }
            }
            td.add(new TranDau(code,gv,club));
        }
        Collections.sort(td);
        for(TranDau res : td){
            System.out.println(res);
        }
    }
}
/*
2
AC
AC Milan
12
MU
Manchester United
10
2
IAC1 80000
EMU2 60000
 */