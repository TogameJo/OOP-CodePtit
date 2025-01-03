package J07022;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        File x = new File("C:\\Users\\Lenovo\\Documents\\Ptit code\\OOP PTIT\\OOPPTIT\\J07022\\DATA.in");
        Scanner sc = new Scanner(x);
        ArrayList<String> a = new ArrayList<>();
        while(sc.hasNext()) {
            String num = sc.next();
            try {
                int t = Integer.parseInt(num);
            } catch(NumberFormatException e) {
                a.add(num); // Nếu không thể chuyển đổi (ném ra ngoại lệ), thêm chuỗi vào a
            }
        }
        Collections.sort(a);
        for(String i : a){
            System.out.print(i + " ");
        }
    }
}
