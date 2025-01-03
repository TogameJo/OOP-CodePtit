import java.util.Scanner;

public class J01025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập tọa độ của hình chữ nhật thứ nhất
        int x1_1 = sc.nextInt(); // x1 của hình chữ nhật 1
        int y1_1 = sc.nextInt(); // y1 của hình chữ nhật 1
        int x2_1 = sc.nextInt(); // x2 của hình chữ nhật 1
        int y2_1 = sc.nextInt(); // y2 của hình chữ nhật 1

        // Nhập tọa độ của hình chữ nhật thứ hai
        int x1_2 = sc.nextInt(); // x1 của hình chữ nhật 2
        int y1_2 = sc.nextInt(); // y1 của hình chữ nhật 2
        int x2_2 = sc.nextInt(); // x2 của hình chữ nhật 2
        int y2_2 = sc.nextInt(); // y2 của hình chữ nhật 2

        // Tìm tọa độ trái dưới và phải trên của hình bao quanh cả 2 hình chữ nhật
        int minX = Math.min(x1_1, x1_2); // tọa độ nhỏ nhất theo trục x
        int maxX = Math.max(x2_1, x2_2); // tọa độ lớn nhất theo trục x
        int minY = Math.min(y1_1, y1_2); // tọa độ nhỏ nhất theo trục y
        int maxY = Math.max(y2_1, y2_2); // tọa độ lớn nhất theo trục y

        // Tính chiều dài và chiều rộng của hình chữ nhật bao quanh
        int width = maxX - minX;
        int height = maxY - minY;

        // Cạnh của hình vuông phải bằng cạnh lớn nhất giữa chiều rộng và chiều cao
        int side = Math.max(width, height);

        // Diện tích của hình vuông
        int area = side * side;

        // In ra diện tích của hình vuông
        System.out.println(area);
    }
}
