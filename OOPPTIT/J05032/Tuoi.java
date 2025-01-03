package J05032;

import java.util.*;
import java.text.*;

public class Tuoi implements Comparable<Tuoi>{
    private String name;
    private Date date;

    public Tuoi(String name, String date) throws ParseException {
        this.name = name;
        this.date = new SimpleDateFormat("dd/MM/yyyy").parse(date);
    }

    public String ngay(){
        String ngay = new SimpleDateFormat("dd/MM/yyyy").format(date);
        return ngay.substring(0,2);
    }

    public String thang(){
        String ngay = new SimpleDateFormat("dd/MM/yyyy").format(date);
        return ngay.substring(3,5);
    }

    public String nam(){
        String ngay = new SimpleDateFormat("dd/MM/yyyy").format(date);
        return ngay.substring(6,10);
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Tuoi o) {
        if(this.nam().equals(o.nam())){
            if(this.thang().equals(o.thang())){
                return this.ngay().compareTo(o.ngay());
            }
            return this.thang().compareTo(o.thang());
        }
        return this.nam().compareTo(o.nam());
    }
    @Override
    public String toString(){
        return name;
    }
}
