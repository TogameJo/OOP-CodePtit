package J05075;

import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = n;
        sc.nextLine();
        ArrayList<SinhVien> sv = new ArrayList<>();
        while(n --> 0){
            String code = sc.nextLine();
            String name = sc.nextLine();
            String cl = sc.nextLine();
            sv.add(new SinhVien(code,name,cl));
        }
        HashMap<String,Integer> mp = new HashMap<>();
        while(t --> 0){
            String[] temp = sc.nextLine().split("\\s+");
            String code = temp[0];
            String dd = temp[1];
            int diem = 10;
            for(int i = 0;i < dd.length();i++){
                if(dd.charAt(i) == 'v'){
                    diem -= 2;
                }else if(dd.charAt(i) == 'm'){
                    diem -= 1;
                }
            }
            if(diem >= 0){
                mp.put(code,diem);
            }else{
                mp.put(code,0);
            }
        }
        String tv = sc.nextLine();
        for(SinhVien res : sv){
            if(res.getCl().equals(tv)){
                if(mp.get(res.getCode()) == 0){
                    System.out.println(res + " " + mp.get(res.getCode()) + " " + "KDDK");
                }else{
                    System.out.println(res + " " + mp.get(res.getCode()));
                }
            }
        }
    }
}
/*
3
B19DCCN999
Le Cong Minh
D19CQAT02-B
B19DCCN998
Tran Truong Giang
D19CQAT02-B
B19DCCN997
Nguyen Tuan Anh
D19CQCN04-B
B19DCCN998 xxxmxmmvmx
B19DCCN997 xmxmxxxvxx
B19DCCN999 xvxmxmmvvm
D19CQAT02-B
 */
