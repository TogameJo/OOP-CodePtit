package thread;
import java.util.*;

public class SoHoanHao extends Thread {

    public static boolean hoanhao(int n) {
        int sum = 1;
        int temp = n;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) {
                    sum += n / i;
                }
            }
        }
        return sum == temp;
    }

    public void run() {
        for (int i = 2; i <= 10000; i++) {
            if (hoanhao(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

