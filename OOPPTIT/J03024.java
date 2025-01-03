import java.util.*;

public class J03024 {
    public static void check(String s) {
        int cntc = 0, cntl = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i)) || s.charAt(0) == '0') {
                System.out.println("INVALID");
                return;
            } else {
                int n = s.charAt(i) - '0';
                if (n % 2 == 0) {
                    cntc++;
                } else {
                    cntl++;
                }
            }
        }
        if (cntc > cntl || cntl > cntc) {
            System.out.println("YES");
        } else if(cntc == cntl || cntc == 0 || cntl == 0){
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            check(s);
        }
    }
}
