import java.util.Scanner;

public class J03021 {

    public static boolean check(String s) {
        StringBuilder temp = new StringBuilder(s);
        String ans = temp.reverse().toString();
        return s.equals(ans); // so sanh 2 chuoi
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine().toLowerCase();
            StringBuilder res = new StringBuilder();

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch >= 'a' && ch <= 'c') res.append(2);
                else if (ch >= 'd' && ch <= 'f') res.append(3);
                else if (ch >= 'g' && ch <= 'i') res.append(4);
                else if (ch >= 'j' && ch <= 'l') res.append(5);
                else if (ch >= 'm' && ch <= 'o') res.append(6);
                else if (ch >= 'p' && ch <= 's') res.append(7);
                else if (ch >= 't' && ch <= 'v') res.append(8);
                else if (ch >= 'w' && ch <= 'z') res.append(9);
            }

            if (check(res.toString())) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
