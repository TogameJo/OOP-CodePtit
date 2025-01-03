package J05048;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<XuatHang> xh = new ArrayList<>();
        while(t --> 0){
            String code = sc.nextLine();
            int nhap = sc.nextInt();
            sc.nextLine();
            xh.add(new XuatHang(code,nhap));
        }
        Collections.sort(xh);
        char c = sc.next().charAt(0);
        for(XuatHang res : xh){
            if(res.getdau() == c){
                System.out.println(res);
            }
        }
    }
}
/*
3
A001Y
1000
B012N
2500
B003Y
4582
B
 */