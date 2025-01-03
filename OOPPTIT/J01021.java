import java.util.*;

public class J01021 {
    static final long mod = 1000000007;
    // Hàm lũy thừa nhanh để tính (a^b) % mod
    public static long powerMod(long a, long b) {
        long result = 1;
        a = a % mod; // Đảm bảo a không lớn hơn mod
        while (b > 0) {
            if (b % 2 == 1) {
                result = (result * a) % mod;
            }
            a = (a * a) % mod;
            b /= 2;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            if (a == 0 && b == 0) {
                break;
            }
            System.out.println(powerMod(a, b));
        }
    }
}
