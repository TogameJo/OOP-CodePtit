package J06004;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVienBT2> svien = new ArrayList<>();
        for(int i = 0;i < M;i++){
            String code = sc.nextLine();
            String name = sc.nextLine();
            String sdt = sc.nextLine();
            int nhom = sc.nextInt();
            sc.nextLine();
            svien.add(new SinhVienBT2(code,name,sdt,nhom));
        }
        HashMap<Integer,String> mp = new HashMap<>();
        for(int i = 1;i <= N;i++){
            String bt = sc.nextLine();
            mp.put(i,bt);
        }
        Collections.sort(svien,SinhVienBT2::compare);
        for(SinhVienBT2 res : svien){
            int gr = res.getnhom();
            System.out.println(res + " " + mp.get(gr));
        }
    }
}
