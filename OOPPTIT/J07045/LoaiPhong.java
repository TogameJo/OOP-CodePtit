package J07045;
import java.util.*;

public class LoaiPhong implements Comparable<LoaiPhong>{
    private String ma,name;
    private int dg;
    private double phi;
    public LoaiPhong(String s) {
        String[] parts = s.split(" ");
        this.ma = parts[0];
        this.name = parts[1];
        this.dg = Integer.parseInt(parts[2]);
        this.phi = Double.parseDouble(parts[3]);
    }
    @Override
    public String toString(){
        return ma + " " + name + " " + dg + " " + phi;
    }
    public int compareTo(LoaiPhong a){
        return this.name.compareTo(a.name);
    }
}
