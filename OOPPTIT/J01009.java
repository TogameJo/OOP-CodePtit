import java.util.Scanner;

public class J01009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        long factorial = 1;

        // Tính tổng S = 1! + 2! + 3! + ... + n!
        for (int i = 1; i <= n; i++) {
            factorial *= i; // Tính giai thừa của i
            sum += factorial; // Cộng dồn vào tổng
        }

        // In kết quả
        System.out.println(sum);
    }
}
