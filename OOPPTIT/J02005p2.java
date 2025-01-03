import java.util.*;

public class J02005p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Đọc n và m
        int n = sc.nextInt();
        int m = sc.nextInt();

        // Tạo HashSet để lưu các phần tử duy nhất của a và b
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        // Đọc các phần tử của a[] và thêm vào setA
        for (int i = 0; i < n; i++) {
            setA.add(sc.nextInt());
        }

        // Đọc các phần tử của b[] và thêm vào setB
        for (int i = 0; i < m; i++) {
            setB.add(sc.nextInt());
        }

        // Tìm tập giao của setA và setB
        setA.retainAll(setB);

        // Chuyển tập giao thành List để sắp xếp
        List<Integer> result = new ArrayList<>(setA);
        Collections.sort(result);

        // In ra kết quả
        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close(); // Đóng scanner
    }
}
