import java.util.Scanner;

public class J03008 {
    public static boolean check(String s) {
        for (int i = 0; i < s.length(); i++) {
            char so = s.charAt(i);
            if (so != '2' && so != '3' && so != '5' && so != '7') {
                return false;
            }
        }
        return true;
    }

    public static boolean stn(String s) {
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            if (stn(s) && check(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
