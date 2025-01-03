package J06007;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int mmh = sc.nextInt();
        sc.nextLine();
        ArrayList<MonHoc> mh = new ArrayList<>();
        for(int i = 0;i < mmh;i++){
            String id = sc.next();
            String name = sc.nextLine().trim();
            mh.add(new MonHoc(id,name));
        }

        int mgv = sc.nextInt();
        sc.nextLine();
        ArrayList<GiangVien> gv = new ArrayList<>();
        for(int i = 0;i < mgv;i++){
            String idgv = sc.next();
            String namegv = sc.nextLine().trim();
            gv.add(new GiangVien(idgv,namegv));
        }
        int mtg = sc.nextInt();
        sc.nextLine();
        ArrayList<ThoiGian> tg = new ArrayList<>();
        for(int i = 0;i < mtg;i++){
            String idgv = sc.next();
            String idmh = sc.next();
            double time = sc.nextDouble();
            sc.nextLine();
            GiangVien gvien = null;
            MonHoc mhoc = null;
            for(GiangVien g :gv){
                if(g.getId().equals(idgv)){
                    gvien = g;
                }
            }
            tg.add(new ThoiGian(gvien,time));
        }
        for(ThoiGian res : tg){
            System.out.println(res);
        }
    }
}
/*
4
INT1155 Tin hoc co so 2
INT1306 Cau truc du lieu va giai thuat
INT1212 Toan Roi rac
INT1111 co so du lieu
2
GV01 Nguyen Van An
GV02 Hoang Binh Minh
4
GV01 INT1155 113.2
GV02 INT1306 126.72
GV02 INT1111 100.08
GV01 INT1212 100.8
 */