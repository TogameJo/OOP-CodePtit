package J05010;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<MatHang> mh = new ArrayList<>();
        for(int i = 1; i <= t;i++){
            String code = String.format("%01d",i);
            String name = sc.nextLine();
            String loai = sc.nextLine();
            double mua = sc.nextDouble();
            double ban = sc.nextDouble();
            sc.nextLine();
            mh.add(new MatHang(code,name,loai,mua,ban));
        }
        Collections.sort(mh);
        for(MatHang res : mh){
            System.out.println(res);
        }
    }
}
/*
3
May tinh SONY VAIO
Dien tu
16400
17699
Tu lanh Side by Side
Dien lanh
18300
25999
Banh Chocopie
Tieu dung
27.5
37
 */