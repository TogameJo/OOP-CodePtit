import java.util.Scanner;

public class J01003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == 0 && b != 0) {
            System.out.println("VN");
        } else if (a == 0 && b == 0) {
            System.out.println("VSN");
        } else {
            // Tính toán và in kết quả với 2 chữ số thập phân
            double res = -(double) b / a;
            System.out.printf("%.2f%n", res);
        }
    }
}
