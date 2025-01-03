package J05081;
import java.util.*;

public class MatHang {
    private String ma,name,dv;
    private int mua,ban,loinhuan;
    private static int cnt = 0;
    public MatHang(String name,String dv, int mua,int ban){
        cnt++;
        this.ma = String.format("MH"+"%03d",cnt);
        this.name = name;
        this.dv = dv;
        this.mua = mua;
        this.ban = ban;
        this.loinhuan = ban - mua;
    }
    public static Comparator<MatHang> ss(){
        return new Comparator<MatHang>(){
            public int compare(MatHang a, MatHang b){
                int loinhuana = a.ban - a.mua;
                int loinhuanb = b.ban - b.mua;
                return Integer.compare(loinhuanb,loinhuana);
            }
        };
    }
    public String toString(){
        return ma + " " + name + " " + dv + " " + mua + " " + ban + " " + loinhuan;
    }
}
