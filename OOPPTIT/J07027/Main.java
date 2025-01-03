package J07027;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] ars) throws FileNotFoundException {
        File x = new File("SINHVIEN.in");
        Scanner sc1 = new Scanner(x);
        int n = Integer.parseInt(sc1.nextLine());
        ArrayList<SinhVien> sv = new ArrayList<>();
        while(n --> 0){
            String code = sc1.nextLine();
            String name = sc1.nextLine();
            String sdt = sc1.nextLine();
            sv.add(new SinhVien(code,name,sdt));
        }
        Collections.sort(sv);
        File y = new File("BAITAP.in");
        Scanner sc2 = new Scanner(y);
        int t = Integer.parseInt(sc2.nextLine());
        HashMap<Integer,String> mp = new HashMap<>();
        for(int i = 1;i <= t;i++){
            String name = sc2.nextLine();
            mp.put(i,name);
        }
        File z = new File("NHOM.in");
        Scanner sc3 = new Scanner(z);
        HashMap<String,Integer> gr = new HashMap<>();
        while(sc3.hasNextLine()){
            String[]temp = sc3.nextLine().split("\\s+");
            String code = temp[0];
            int nhom = Integer.parseInt(temp[1]);
            gr.put(code,nhom);
        }
        List<Map.Entry<String,Integer>> list = new ArrayList<>(gr.entrySet());
        list.sort(Map.Entry.comparingByKey());
        for(Map.Entry<String,Integer> entry:list){
            for(SinhVien res : sv){
                if(res.getCode().equals(entry.getKey())){
                    System.out.println(res + " " + entry.getValue() + " " + mp.get(entry.getValue()));
                    break;
                }
            }
        }
    }
}
