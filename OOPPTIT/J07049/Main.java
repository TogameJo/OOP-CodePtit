package J07049;
import java.text.ParseException;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        File x = new File("MUAHANG.in");
        Scanner sc = new Scanner(x);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SanPham> sp = new ArrayList<>();
        while(n --> 0){
            String id = sc.nextLine();
            String name = sc.nextLine();
            int gia = Integer.parseInt(sc.nextLine());
            int bh = Integer.parseInt(sc.nextLine());
            sp.add(new SanPham(id,name,gia,bh));
        }
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> kh = new ArrayList<>();
        for(int i = 1;i <= t;i++){
            String id = "KH"+String.format("%02d",i);
            String name = sc.nextLine();
            String add = sc.nextLine();
            String idsp = sc.nextLine();
            int sl = Integer.parseInt(sc.nextLine());
            String date = sc.nextLine();
            SanPham spham = null;
            for(SanPham j : sp){
                if(j.getId().equals(idsp)){
                    spham = j;
                    break;
                }
            }
            kh.add(new KhachHang(id,name,add,spham,sl,date));
        }
        Collections.sort(kh);
        for(KhachHang res : kh){
            System.out.println(res);
        }
    }
}
