package J05009;
import java.util.*;
import java.text.*;

public class ThiSinh implements Comparable<ThiSinh>{
    private String msv,name;
    private String date;
    private double a,b,c;
    private static int cnt = 0;
    public ThiSinh(String name,String date,Double a,Double b,Double c){
        cnt++;
        this.msv = String.format("%01d",cnt);
        this.name = name;
        this.date = date;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double tongdiem(){
        return this.a + this.b + this.c;
    }

    @Override
    public int compareTo(ThiSinh o) {
        if(this.tongdiem() == o.tongdiem()){
            return this.msv.compareTo(o.msv);
        }
        return Double.compare(o.tongdiem(),this.tongdiem());
    }

    public String toString(){
        return msv + " " + name + " " + date + " " + (a+b+c);
    }

}
