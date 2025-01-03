package J07034;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        File x = new File("MONHOC.in");
        Scanner sc = new Scanner(x);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<MonHoc> a = new ArrayList<>();
        for(int i = 0;i < n;i++){
            String ma = sc.next();
            sc.nextLine();
            String name = sc.nextLine();
            int tin = sc.nextInt();
            MonHoc s = new MonHoc(ma,name,tin);
            a.add(s);
        }
        Collections.sort(a,MonHoc::compare);
        for(MonHoc res : a){
            System.out.println(res);
        }
    }
}
