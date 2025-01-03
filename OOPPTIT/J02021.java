import java.util.*;

public class J02021 {
    int num = 100;
    int[] X = new int[100];
    int N, K;
    int cnt = 0;

    // Constructor để khởi tạo N và K
    public J02021(int N, int K) {
        this.N = N;
        this.K = K;
    }

    public void init() {
        for (int i = 1; i <= K; i++) {
            System.out.print(X[i]);
        }
        System.out.print(" ");
    }

    public void Try(int i) {
        for (int j = X[i - 1] + 1; j <= N - K + i; j++) {
            X[i] = j;
            if (i == K) {
                init();
                cnt++;
            } else {
                Try(i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        // Tạo đối tượng J02020 với N và K
        J02021 obj = new J02021(N, K);
        // Khởi tạo mảng X với giá trị 0 tại chỉ số 0
        obj.X[0] = 0;
        // Gọi phương thức Try để bắt đầu tạo tổ hợp
        obj.Try(1);
        System.out.println();
        System.out.println("Tong cong co " + obj.cnt+" to hop");

        sc.close();
    }
}
