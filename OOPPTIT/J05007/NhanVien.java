package J05007;
import java.util.*;
import java.text.*;
public class NhanVien {
    private String code,name,sx,add,mst;
    private Date bi,date;
    private static int cnt = 0;
    public NhanVien(String name, String sx, String bi, String add, String mst, String date) throws ParseException{
        cnt++;
        this.code = String.format("%05d",cnt);
        this.name = name;
        this.sx = sx;
        this.bi = new SimpleDateFormat("dd/MM/yyyy").parse(bi);
        this.add = add;
        this.mst = mst;
        this.date = new SimpleDateFormat("dd/MM/yyyy").parse(date);
    }
    public static Comparator<NhanVien> ss(){
        return new Comparator<NhanVien>(){
            public int compare(NhanVien b, NhanVien a){
                return b.bi.compareTo(a.bi);
            }
        };
    }
    public String toString(){
        return code + " " + name + " " + sx + " " + new SimpleDateFormat("dd/MM/yyyy").format(bi) + " " + add + " " + mst + " "
                + new SimpleDateFormat("dd/MM/yyyy").format(date);
    }
}
