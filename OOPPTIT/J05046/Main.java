package J05046;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<NhapKho> nk = new ArrayList<>();
        HashMap<String,Integer> mp = new HashMap<>();
        while(t --> 0){
            String name = sc.nextLine();
            int sl = sc.nextInt();
            long gia = sc.nextLong();
            sc.nextLine();
            nk.add(new NhapKho(name,sl,gia));
        }
        for(NhapKho res : nk){
            System.out.println(res);
        }
    }
}
/*
3
May lanh SANYO
12
4000000
Dien thoai Samsung
30
3230000
Dien thoai Nokia
18
1240000
 */