package MaTran;
import java.util.*;
import java.text.*;
public class Matrix {
    private int row,col;
    private int[][] data;
    public Matrix(int row,int col) {
        this.row = row;
        this.col = col;
        data = new int[row][col];
    }
    public void khoitao(int r, int c, int val){
        if (r >= 0 && r < row && c >= 0 && c < col) {
            data[r][c] = val;
        }
    }
    public void sortmatrix(int i) {
        for (i = 0; i < col; i++) {
            int[] temp = new int[row];
            for (int j = 0; j < row; j++) {
                temp[j] = data[j][i];
            }
            Arrays.sort(temp);
            for(int j = 0;j < row;j++)
            {
                data[j][i] = temp[j];
            }
        }
    }
    public String toString(){
        StringBuilder res = new StringBuilder();
        for(int i = 0;i < row;i++){
            for(int j = 0;j < col;j++){
                res.append(data[i][j]).append(" ");
            }
            res.append("\n");
        }
        return res.toString();
    }
}
