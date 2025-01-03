import java.util.*;

public class J01002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Số lượng test case
        while (t > 0) {
            int a = sc.nextInt(); // Nhập giá trị a
            // Tính tổng từ 1 đến a bằng công thức
            long sum = (long) a * (a + 1) / 2; // Sử dụng long để tránh tràn số
            System.out.println(sum); // In ra tổng
            t--; // Giảm số lượng test case
        }
        sc.close();
    }
}
