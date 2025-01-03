package J07051;

import java.util.*;
import java.text.*;

public class KhachHang implements Comparable<KhachHang>{
    private String id,name,sp;
    private Date ngaynhan,ngaytra;
    private int tien;

    public void chuanhoa(){
        String s = this.name.toLowerCase();
        StringTokenizer tk = new StringTokenizer(s);
        ArrayList<String> w = new ArrayList<>();
        while(tk.hasMoreTokens()){
            w.add(tk.nextToken());
        }
        StringBuilder res = new StringBuilder();
        int n = w.size();
        for(int i = 0 ;i < n;i++){
            String temp = w.get(i);
            if(i >= 1){
                res.append(" ");
            }
            res.append(Character.toUpperCase(temp.charAt(0)));
            res.append(temp.substring(1));
        }
        this.name = res.toString();
    }
    public KhachHang(String id,String name, String sp, String ngaynhan, String ngaytra, int tien) throws ParseException {
        this.id = id;
        this.name = name;
        chuanhoa();
        this.sp = sp;
        this.ngaynhan = new SimpleDateFormat("dd/MM/yyyy").parse(ngaynhan);
        this.ngaytra = new SimpleDateFormat("dd/MM/yyyy").parse(ngaytra);
        this.tien = tien;
    }
    public int tienphong(){
        if(this.sp.charAt(0) == '1'){
            return 25;
        }else if(this.sp.charAt(0) == '2'){
            return 34;
        }else if(this.sp.charAt(0) == '3'){
            return 50;
        }else if(this.sp.charAt(0) == '4'){
            return 80;
        }
        return 0;
    }
    public long ngayo(){
        return (this.ngaytra.getTime() - this.ngaynhan.getTime())/(24*60*60*1000) + 1;
    }
    public long tongtien(){
        return (ngayo() * tienphong()) + this.tien;
    }
    @Override
    public int compareTo(KhachHang o){
        return Long.compare(o.tongtien(),this.tongtien());
    }
    @Override
    public String toString() {
        return id + " " + name + " " + sp + " " + ngayo() + " " + tongtien();
    }
}
