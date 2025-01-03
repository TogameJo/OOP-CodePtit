package J07059;

import java.text.*;
import java.util.*;

public class Cathi implements Comparable<Cathi>{
    private Date ngaythi;
    private String code,giothi,phongthi;

    public Cathi(String code, String ngaythi, String giothi, String phongthi) throws ParseException {
        this.code = code;
        this.ngaythi = new SimpleDateFormat("dd/MM/yyyy").parse(ngaythi);
        this.giothi = giothi;
        this.phongthi = phongthi;
    }

    @Override
    public int compareTo(Cathi o) {
        int dateComparison = this.ngaythi.compareTo(o.ngaythi);
        if(dateComparison == 0){
            return this.giothi.compareTo(o.giothi);
        }
        return dateComparison;
    }

    @Override
    public String toString(){

        return code + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaythi) + " " + giothi + " " + phongthi;
    }
}
