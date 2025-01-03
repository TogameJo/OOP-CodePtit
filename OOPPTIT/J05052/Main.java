package J05052;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<DonHang> dh = new ArrayList<>();
        while(t --> 0){
            String name = sc.nextLine();
            String code = sc.nextLine();
            long gia = sc.nextLong();
            int sl = sc.nextInt();
            sc.nextLine();
            dh.add(new DonHang(name,code,gia,sl));
        }
        Collections.sort(dh);
        for(DonHang res : dh){
            System.out.println(res);
        }
    }
}
/*
3
Kaki 2
K0252
80000
15
Jean 1
J2011
200000
24
Jean 2
J0982
150000
12
 */