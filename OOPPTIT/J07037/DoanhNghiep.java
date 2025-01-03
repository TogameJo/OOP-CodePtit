package J07037;
import java.util.*;

public class DoanhNghiep {
    private String ma,name;
    private int sosinhvien;
    public DoanhNghiep(String ma,String name,int sosinhvien){
        this.ma = ma;
        this.name = name;
        this.sosinhvien = sosinhvien;
    }
    public static int compare(DoanhNghiep a ,DoanhNghiep b){
        return a.ma.compareTo(b.ma);
    }
    public String toString(){
        return ma + " " + name + " " + sosinhvien;
    }
}
