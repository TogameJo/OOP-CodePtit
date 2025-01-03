package MaTran;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        File x = new File("C:\\Users\\Lenovo\\Documents\\Ptit code\\OOP PTIT\\OOPPTIT\\MaTran\\MATRIX.in");
        Scanner sc = new Scanner(x);
        int t = sc.nextInt();
        ArrayList<Matrix> v = new ArrayList<>();
        for(int l = 0; l< t;l++){
            int row = sc.nextInt();
            int col = sc.nextInt();
            Matrix s = new Matrix(row,col);
            int k = sc.nextInt();
            for(int i = 0;i < row;i++){
                for(int j = 0;j < col;j++){
                    s.khoitao(i,j,sc.nextInt());
                }
            }
            s.sortmatrix(k);
            v.add(s);
            for(Matrix m : v){
                System.out.println(m);
            }
        }
        sc.close();
    }
}
