import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class J03004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            s = s.toLowerCase();
            StringTokenizer tk = new StringTokenizer(s);
            ArrayList<String> word = new ArrayList<>();
            while(tk.hasMoreTokens()){
                word.add(tk.nextToken());
            }
            int n = word.size();
            StringBuilder res = new StringBuilder();
            for(int i = 0;i < n;i++){
                if(i >= 1){ // Thêm khoảng trắng giữa các từ, không thêm sau từ cuối
                    res.append(" ");
                }
                String ans = word.get(i);
                res.append(Character.toUpperCase(ans.charAt(0)));// Viết hoa ký tự đầu tiên
                res.append(ans.substring(1));// Thêm phần còn lại của từ không thay đổi
                //substring(1) trả về phần con của chuỗi bắt đầu từ chỉ số 1 cho đến hết chuỗi.
                //vd hello : substring(1) -> ello
            }
            System.out.println(res.toString());
        }
    }
}
