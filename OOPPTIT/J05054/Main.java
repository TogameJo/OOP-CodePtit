package J05054;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> sv = new ArrayList<>();
        for(int i = 0;i < t;i++){
            String code = "HS" + String.format("%02d",i+1);
            String name = sc.nextLine();
            double grade = sc.nextDouble();
            sc.nextLine();
            sv.add(new SinhVien(code,name,grade));
        }
        ArrayList<SinhVien> temp = new ArrayList<>(sv);
        Collections.sort(temp);
        HashMap<Double,Integer> mp = new HashMap<>();
        int rank = 1;
        for(int i = 0;i < temp.size();i++){
            if(i > 0 && temp.get(i).getGrade() == temp.get(i-1).getGrade()){
                mp.put(temp.get(i).getGrade(),rank);
            }else{
                rank = i+1;
                mp.put(temp.get(i).getGrade(),rank);
            }
        }
        for(SinhVien res : sv){
            System.out.println(res + " " + mp.get(res.getGrade()));
        }
    }
}
/*
5
Nguyen Trung Hieu
9.2
Nguyen Quang Huy
9.2
Tran Minh Hieu
5.9
Nguyen Bao Trung
8.6
Le Hong Ha
9.2
 */