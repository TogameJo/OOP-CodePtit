package J05055;
import java.util.*;
import java.text.*;
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<TinhGio> tg = new ArrayList<>();
        for(int i = 1;i <= t;i++){
            String code = "VDV"+String.format("%02d",i);
            String name = sc.nextLine();
            String date = sc.nextLine();
            String xp = sc.nextLine();
            String ht = sc.nextLine();
            tg.add(new TinhGio(code,name,date,xp,ht));
        }
        int rank = 1;
        ArrayList<TinhGio> temp = new ArrayList<>(tg);
        Collections.sort(temp);
        HashMap<Long,Integer> mp = new HashMap<>();
        for(int i = 0;i < temp.size();i++){
            if(i > 0 && temp.get(i).gets()==temp.get(i-1).gets()){
                mp.put(temp.get(i).gets(),rank);
            }else{
                rank = i+1;
                mp.put(temp.get(i).gets(),rank);
            }
        }
        for(TinhGio res : temp){
            System.out.println(res + " " + mp.get(res.gets()));
        }
    }
}
/*
5
Nguyen Quang Huy
03/07/2002
07:00:00
07:10:00
Nguyen Van Dai
02/01/2002
07:00:00
07:10:30
Nguyen Van Thanh
20/03/1990
07:00:00
07:10:01
Nguyen Hoa Binh
01/10/1993
07:02:00
07:11:20
Le Thanh Van
15/03/1998
07:05:00
07:15:30
 */