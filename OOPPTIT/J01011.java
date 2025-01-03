import java.util.Scanner;

public class J01011 {
    public static int usc(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static long bsc(int a, int b) {
        return (long) a * b / usc(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.print(bsc(a, b) + " " + usc(a, b));
            System.out.println();
        }
        sc.close();
    }
}
