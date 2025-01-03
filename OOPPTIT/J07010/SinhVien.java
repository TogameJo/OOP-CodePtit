package J07010;
import java.util.*;
import java.text.*;

public class SinhVien {
    private String msv,name,cl;
    private Date bi;
    private double gpa;
    private static int cnt = 0;
    public SinhVien(String name,String cl,String bi,double gpa) throws ParseException{
        cnt++;
        this.msv = String.format("B20DCCN" + "%03d",cnt);
        this.name = name;
        this.cl = cl;
        this.bi =  new SimpleDateFormat("dd/MM/yyyy").parse(bi);
        this.gpa = gpa;
    }
    public String toString(){
        return msv + " " + name + " " + cl +" " + new SimpleDateFormat("dd/MM/yyyy").format(bi) + " " + String.format("%.2f",gpa);
    }
}
