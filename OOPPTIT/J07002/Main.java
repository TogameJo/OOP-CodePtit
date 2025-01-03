package J07002;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File x = new File("DATA.in");
        Scanner sc = new Scanner(x);
        long sum = 0;
        while (sc.hasNext()) {
            try {
                String num = sc.next();
                sum += Integer.parseInt(num);
            } catch (NumberFormatException e) {

            }
        }
        System.out.println(sum);
    }
}
