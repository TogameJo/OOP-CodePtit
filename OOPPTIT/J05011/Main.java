package J05011;

import java.text.ParseException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<TinhGio> tg=  new ArrayList<>();
        for(int i = 0;i < t;i++){
            String code = sc.nextLine();
            String name = sc.nextLine();
            String vao = sc.nextLine();
            String ra = sc.nextLine();
            tg.add(new TinhGio(code,name,vao,ra));
        }
        Collections.sort(tg);
        for(TinhGio res : tg){
            System.out.println(res);
        }
    }
}
/*
3
01T
Nguyen Van An
09:00
10:30
06T
Hoang Van Nam
15:30
18:00
02I
Tran Hoa Binh
09:05
10:00
 */