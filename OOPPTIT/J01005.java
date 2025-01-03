import java.util.Scanner;

public class J01005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // số lượng bộ test

        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int H = sc.nextInt();

            for (int i = 1; i < N; i++) {
                // Tính khoảng cách từ đỉnh đến lát cắt thứ i
                double l = Math.sqrt((double)i / N) * H;
                System.out.printf("%.6f ", l);
            }
            System.out.println(); // In xuống dòng cho mỗi bộ test
        }
    }
}
