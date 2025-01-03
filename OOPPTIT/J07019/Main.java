package J07019;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File x = new File("DATA1.in");
        Scanner sc1 = new Scanner(x);
        int t = Integer.parseInt(sc1.nextLine());
        ArrayList<SanPham> sp = new ArrayList<>();
        while(t --> 0){
            String id = sc1.nextLine();
            String name = sc1.nextLine();
            long gia1 = Long.parseLong(sc1.nextLine());
            long gia2 = Long.parseLong(sc1.nextLine());
            sp.add(new SanPham(id,name,gia1,gia2));
        }

        File y = new File("DATA2.in");
        Scanner sc2 = new Scanner(y);
        int n = Integer.parseInt(sc2.nextLine());
        ArrayList<HoaDon> hd = new ArrayList<>();
        for(int j = 1;j <= n;j++){
            String[] temp = sc2.nextLine().split("\\s+");
            String id = temp[0] + "-" + String.format("%03d",j);
            String newid = temp[0].substring(0,2);
            int sl = Integer.parseInt(temp[1]);

            SanPham spham = null;
            for(SanPham i : sp){
                if(i.getId().equals(newid)){
                    spham = i;
                    break;
                }
            }

            hd.add(new HoaDon(id,sl,spham));
        }
        for(HoaDon res : hd){
            System.out.println(res);
        }
    }
}
