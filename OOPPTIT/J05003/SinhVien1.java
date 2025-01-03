package J05003;
import java.util.*;
import java.text.*;

public class SinhVien1 {
    private String code,name,cl;
    private Date date;
    private double gpa;
    private static int cnt = 0;
    public SinhVien1(String name,String cl,String date,Double gpa) throws ParseException{
        cnt++;
        this.code = String.format("B20DCCN" + "%03d",cnt);
        this.name = name;
        this.cl = cl;
        this.date = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        this.gpa = gpa;
    }
    public String toString(){
        return code + " " + name + " " + cl + " " + new SimpleDateFormat("dd/MM/yyyy").format(date) + " " + String.format("%.2f", gpa);
    }
}
