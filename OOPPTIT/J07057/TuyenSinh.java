package J07057;

import java.util.*;

public class TuyenSinh implements Comparable<TuyenSinh>{
    private String code,name,dt;
    private double dthi;
    private int kv;

    public void chuanhoa(){
        String s = this.name.toLowerCase();
        StringTokenizer tk = new StringTokenizer(s);
        ArrayList<String> w = new ArrayList<>();
        while(tk.hasMoreTokens()){
            w.add(tk.nextToken());
        }
        StringBuilder res = new StringBuilder();
        for(int i = 0;i < w.size();i++){
            String temp = w.get(i);
            if(i >= 1){
                res.append(" ");
            }
            res.append(Character.toUpperCase(temp.charAt(0)));
            res.append(temp.substring(1));
        }
        this.name = res.toString();
    }

    public TuyenSinh(String code, String name, double dthi, String dt, int kv) {
        this.code = code;
        this.name = name;
        chuanhoa();
        this.dthi = dthi;
        this.dt = dt;
        this.kv = kv;
    }

    public double diemcongvung(){
        if (this.kv == 1) {
            return 1.5;
        } else if (this.kv == 2) {
            return 1;
        }
        return 0;
    }
    public double diemcongdt(){
        if(this.dt.equals("Kinh")){
            return 0;
        }
        return 1.5;
    }

    public double diemchuan(){
        return this.dthi + diemcongvung()+diemcongdt();
    }

    @Override
    public String toString() {
        return code + " " + name + " " + diemchuan();
    }

    @Override
    public int compareTo(TuyenSinh o) {
        if(this.diemchuan() == o.diemchuan()){
            return this.code.compareTo(o.code);
        }
        return Double.compare(o.diemchuan(),this.diemchuan());
    }
}
