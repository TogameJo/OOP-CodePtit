package J07025;

import java.util.*;
import java.text.*;

public class KhachHang implements Comparable<KhachHang>{
    private String code,name,gen,add;
    private Date date;

    public void chuanhoa(){
        String s = this.name.toLowerCase();
        StringTokenizer tk = new StringTokenizer(s);
        ArrayList<String> w = new ArrayList<>();
        while(tk.hasMoreTokens()){
            w.add(tk.nextToken());
        }
        StringBuilder res = new StringBuilder();
        for(int i = 0;i < w.size();i++){
            if(i >= 1){
                res.append(" ");
            }
            String temp = w.get(i);
            res.append(Character.toUpperCase(temp.charAt(0)));
            res.append(temp.substring(1));
        }
        this.name = res.toString();
    }

    public KhachHang(String code, String name, String gen, String date, String add) throws ParseException {
        this.code = code;
        this.name = name;
        chuanhoa();
        this.gen = gen;
        this.date = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        this.add = add;
    }

    public String ngay(){
        String ngay = new SimpleDateFormat("dd/MM/yyyy").format(date);
        return ngay.substring(0,2);
    }
    public String thang(){
        String thang = new SimpleDateFormat("dd/MM/yyyy").format(date);
        return thang.substring(3,5);
    }
    public String year(){
        String nam = new SimpleDateFormat("dd/MM/yyyy").format(date);
        return nam.substring(6,10);
    }

    @Override
    public int compareTo(KhachHang o) {
        if(this.year().equals(o.year())){
            if(this.thang().equals(o.thang())){
                return this.ngay().compareTo(o.ngay());
            }
            return this.thang().compareTo(o.thang());
        }
        return this.year().compareTo(o.year());
    }
    @Override
    public String toString(){
        return code + " " + name + " " + gen + " " + add + " " + new SimpleDateFormat("dd/MM/yyyy").format(date);
    }
}
