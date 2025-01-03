package J05015;
import java.util.*;
import java.text.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<ThiSinh> ts = new ArrayList<>();
        while(t --> 0){
            String name = sc.nextLine();
            String dv = sc.nextLine();
            String time = sc.nextLine();
            ts.add(new ThiSinh(name,dv,time));
        }
        Collections.sort(ts);
        for(ThiSinh res : ts){
            System.out.println(res);
        }
    }
}
/*
3
Tran Vu Minh
Ha Noi
8:30
Vu Ngoc Hoang
Hoa Binh
8:20
Pham Dinh Tan
An Giang
8:45
 */