package J07034;
import java.util.*;

public class MonHoc {
    private String ma,name;
    private int tin;
    public MonHoc(String ma,String name,int tin){
        this.ma = ma;
        this.name = name;
        this.tin = tin;
    }
    public static int compare(MonHoc a,MonHoc b){
        return a.name.compareTo(b.name);
    }
    public String toString(){
        return ma + " " + name + " " + tin;
    }
}
