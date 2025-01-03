import java.util.Scanner;

public class J01006p2 {

    // Phương pháp kiểm tra số Fibonacci bằng cách sử dụng lặp
    public static boolean check(int x) {
        if (x == 0 || x == 1) {
            return true;
        }

        int a = 0;
        int b = 1;
        int c = a + b;

        while (c <= x) {
            if (c == x) {
                return true; // Tìm thấy số Fibonacci
            }
            a = b;
            b = c;
            c = a + b;
        }

        return false; // Không tìm thấy số Fibonacci
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (check(n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
