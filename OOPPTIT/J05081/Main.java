package J05081;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<MatHang> a = new ArrayList<>();
        sc.nextLine();
        for(int i = 0;i < t;i++){
            String name = sc.nextLine();
            String dv = sc.nextLine();
            int mua = sc.nextInt();
            int ban = sc.nextInt();
            sc.nextLine();
            MatHang s = new MatHang(name,dv,mua,ban);
            a.add(s);
        }
        Collections.sort(a,MatHang.ss());
        for(MatHang in : a){
            System.out.println(in);
        }
    }
}
