package J05042;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<Submit> sm = new ArrayList<>();
        for(int i = 1;i <= t;i++){
            String name = sc.nextLine();
            String[] temp = sc.nextLine().split("\\s+");
            int ac = Integer.parseInt(temp[0]);
            int sub = Integer.parseInt(temp[1]);
            sm.add(new Submit(name,ac,sub));
        }
        Collections.sort(sm);
        for(Submit res : sm){
            System.out.println(res);
        }
    }
}
/*
2
Nguyen Van Nam
168 600
Tran Thi Ngoc
168 600
 */
