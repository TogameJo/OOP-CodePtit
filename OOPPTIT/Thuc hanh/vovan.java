import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class vovan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        HashMap<String,Integer> mp = new HashMap<>(); //no giong map trong c++ (mang danh dau)
        while(t-->0) {
            String s = sc.nextLine();
            s = s.toLowerCase();//chuyen thanh chu in thuong
            StringTokenizer tk = new StringTokenizer(s);
            ArrayList<String> word = new ArrayList<>();
            while (tk.hasMoreTokens()) { //Phương thức hasMoreTokens(): Đây là một phương thức của lớp StringTokenizer.
                // Nó kiểm tra xem còn có token nào nữa trong chuỗi chưa được đọc không.
                word.add(tk.nextToken()); //nextToken() là một phương thức của lớp StringTokenizer dùng để lấy token
                // (từ) tiếp theo từ chuỗi.
                // Phương thức này trả về một chuỗi (String), đại diện cho token hiện tại trong quá trình phân tách.
            }
            int n = word.size();
            StringBuilder res = new StringBuilder();
            if (n > 1) {
                res.append(word.get(n - 1)); //theem teen
                for (int i = 0; i < n - 1; i++) {
                    res.append(word.get(i).charAt(0));//them chu ai dau tien cua ho va ten dem
                }
            }
            // Lấy địa chỉ email hiện tại từ HashMap và cập nhật số lần xuất hiện
            String baseEmail = res.toString();  //gan dinh dang email cho baseEmail
            if (mp.containsKey(baseEmail)) {    //neu da xuat hien trong mp
                int count = mp.get(baseEmail);   // so lan da xuat hien = 0
                res.append(count + 2); // Thêm số lần xuất hiện
                mp.put(baseEmail, count + 1); // Cập nhật số lần xuất hiện trong HashMap
            } else {
                mp.put(baseEmail, 0); // Thêm mới vào HashMap với số lần xuất hiện là 0
            }

            res.append("@ptit.edu.vn"); // Thêm định dạng email

            // In kết quả
            System.out.println(res.toString());
        }

        sc.close(); // Đóng Scanner để giải phóng tài nguyên
    }
}
