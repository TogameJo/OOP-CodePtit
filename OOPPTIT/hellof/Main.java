package hellof;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        File inputfile = new File("C:\\Users\\Lenovo\\Documents\\Ptit code\\OOP PTIT\\OOPPTIT\\hellof\\Hello.txt");
        try {
            Scanner sc = new Scanner(inputfile);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        }catch(FileNotFoundException e) {

        }
    }
}
