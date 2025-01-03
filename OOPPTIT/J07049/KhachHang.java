package J07049;
import java.text.*;
import java.util.*;
import java.io.*;
public class KhachHang implements Comparable<KhachHang>{
    private String id,name,add;
    private SanPham sp;
    private int sl;
    private Date ngaymua;

    public KhachHang(String id, String name, String add, SanPham sp, int sl, String ngaymua) throws ParseException {
        this.id = id;
        this.name = name;
        this.add = add;
        this.sp = sp;
        this.sl = sl;
        this.ngaymua = new SimpleDateFormat("dd/MM/yyyy").parse(ngaymua);
    }

    public long tien(){
        return (long)sp.getGia()*sl;
    }

    public int ngay(){
        String date = new SimpleDateFormat("dd/MM/yyyy").format(ngaymua);
        int ngay = Integer.parseInt((date.substring(0,2)));
        return ngay;
    }
    public int thang(){
        String date = new SimpleDateFormat("dd/MM/yyyy").format(ngaymua);
        int thang = Integer.parseInt((date.substring(3,5)));
        return thang;
    }
    public int nam(){
        String date = new SimpleDateFormat("dd/MM/yyyy").format(ngaymua);
        int nam = Integer.parseInt((date.substring(6,10)));
        return nam;
    }
    public String hbh() throws ParseException {
        String date = new SimpleDateFormat("dd/MM/yyyy").format(ngaymua);
        long ngay = Long.parseLong((date.substring(0,2)));
        long thang = Long.parseLong((date.substring(3,5)));
        long nam = Long.parseLong((date.substring(6,10)));

        nam += (thang + sp.getBh()) / 12;
        thang = (thang + sp.getBh()) % 12;
        if (thang == 0) {
            thang = (long)12;
            nam -= 1;
        }
        return String.format("%02d",ngay) + "/" + String.format("%02d",thang) + "/" + nam;
    }

    @Override
    public String toString(){
        try {
            return id + " " + name + " " + add + " " + sp.getId() + " " + tien() + " " + hbh();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int compareTo(KhachHang o) {
        if(this.nam() == o.nam()){
            if(this.thang()==o.thang()){
                if(this.ngay()==o.ngay()){
                    return this.id.compareTo(o.id);
                }
                return Integer.compare(this.ngay(),o.ngay());
            }
            return Integer.compare(this.thang(),o.thang());
        }
        return Integer.compare(this.nam(),o.nam());
    }
}
