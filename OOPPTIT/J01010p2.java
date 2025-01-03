import java.util.Scanner;

public class J01010p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            String num = sc.nextLine();
            StringBuilder res = new StringBuilder(); // Sử dụng StringBuilder để xây dựng kết quả
            boolean valid = true; // Biến để kiểm tra tính hợp lệ của số

            for (int i = 0; i < num.length(); i++) {
                char c = num.charAt(i);
                switch (c) {
                    case '1':
                        res.append("1");
                        break;
                    case '0':
                        res.append("0");
                        break;
                    case '8':
                        res.append("0");
                        break;
                    case '9':
                        res.append("0");
                        break;
                    default:
                        valid = false; // Ký tự không hợp lệ
                        break;
                }
            }

            // Nếu không hợp lệ hoặc chuỗi kết quả chỉ chứa số 0, in ra INVALID
            if (!valid) {
                System.out.println("INVALID");
            } else {
                // Loại bỏ các số 0 ở đầu chuỗi
                String finalRes = res.toString().replaceAll("^0+", "");
                // Nếu chuỗi kết quả sau khi loại bỏ số 0 ở đầu là rỗng, in ra INVALID
                if (finalRes.isEmpty()) {
                    System.out.println("INVALID");
                } else {
                    System.out.println(finalRes);
                }
            }
        }

        sc.close(); // Đóng Scanner để giải phóng tài nguyên
    }
}
