package J07046;

import java.text.*;
import java.util.*;

public class LuuTru implements Comparable<LuuTru>{
    private String mkh,name,mp;
    private Date ngayden,ngaydi;
    public LuuTru(String mkh,String name,String mp,String ngayden,String ngaydi) throws ParseException{
        this.mkh = mkh;
        this.name = name;
        this.mp = mp;
        this.ngayden = new SimpleDateFormat("dd/MM/yyyy").parse(ngayden);
        this.ngaydi = new SimpleDateFormat("dd/MM/yyyy").parse(ngaydi);
    }

    public long ngay(){
        return (this.ngaydi.getTime() - this.ngayden.getTime())/(24*60*60*1000); //chuyen ve ngay tu miligiay
    }
    @Override
    public int compareTo(LuuTru o) {
        return Long.compare(o.ngay(),this.ngay());
    }
    @Override
    public String toString(){
        return mkh + " " + name + " " + mp + " " + ngay();
    }
}
