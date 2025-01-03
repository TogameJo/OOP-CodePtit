package J07015;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Sàng Eratosthenes để đánh dấu số nguyên tố
        boolean[] ok = new boolean[1000005];
        Arrays.fill(ok, true);
        ok[0] = ok[1] = false; // 0 và 1 không phải số nguyên tố

        for (int i = 2; i <= Math.sqrt(ok.length); i++) {
            if (ok[i]) {
                for (int j = i * i; j < 1000005; j += i) {
                    ok[j] = false;
                }
            }
        }

        // Đọc dữ liệu từ file
        try (ObjectInputStream x = new ObjectInputStream(new FileInputStream("SONGUYEN.in"))) {
            ArrayList<Integer> res = (ArrayList<Integer>) x.readObject();
            TreeMap<Integer, Integer> v = new TreeMap<>();

            // Đếm số nguyên tố trong danh sách
            res.forEach(a -> {
                if (a > 0 && a < 1000005 && ok[a]) {
                    v.put(a, v.getOrDefault(a, 0) + 1);
                }
            });

            // In kết quả
            v.forEach((k, l) -> {
                System.out.printf("%d %d\n", k, l);
            });
        }
    }
}