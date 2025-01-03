package J07030;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Sàng nguyên tố
        boolean[] ok = new boolean[1000005];
        Arrays.fill(ok, true);
        ok[0] = ok[1] = false;
        for(int i = 2; i*i < ok.length; i++) {
            if(ok[i]) {
                for(int j = i*i; j < ok.length; j += i) {
                    ok[j] = false;
                }
            }
        }

        // Đọc dữ liệu
        ObjectInputStream x1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> m1 = (ArrayList<Integer>) x1.readObject();
        ObjectInputStream x2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> m2 = (ArrayList<Integer>) x2.readObject();
        x1.close();
        x2.close();

        // Chuyển m2 thành HashSet để tìm kiếm nhanh hơn
        HashSet<Integer> set2 = new HashSet<>(m2);

        // Sort m1 để đảm bảo in ra theo thứ tự tăng dần
        Collections.sort(m1);

        // Tạo HashSet để lưu các cặp đã xử lý
        HashSet<Integer> processed = new HashSet<>();

        for(int x : m1) {
            if (processed.contains(x)) continue; //neu da ton tai x den vs vong lap tiep
            int y = 1000000 - x;
            if(x < y && set2.contains(y) && ok[x] && ok[y]) {
                System.out.println(x + " " + y);
                processed.add(x);
                processed.add(y);
            }
        }
    }
}