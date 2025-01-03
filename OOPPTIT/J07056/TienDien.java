package J07056;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class TienDien implements Comparable<TienDien>{
    private String id,name;
    private String loai;
    private int sodau,socuoi;

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

    public TienDien(String id, String name, String loai, int sodau, int socuoi) {
        this.id = id;
        this.name = name;
        chuanhoa();
        this.loai = loai;
        this.sodau = sodau;
        this.socuoi = socuoi;
    }

    public int loaidm(){
        if(this.loai.equals("A")){
            return 100;
        }else if(this.loai.equals("B")){
            return 500;
        }else if(this.loai.equals("C")){
            return 200;
        }
        return 0;
    }

    public int sodien(){
        return this.socuoi - this.sodau;
    }

    public int tdm(){
        return Math.min(sodien(), loaidm()) * 450;
    }

    public int vdm(){
        if(sodien() > loaidm()){
            return (sodien()-loaidm())*1000;
        }
        return 0;
    }

    public int VAT(){
        return (vdm()*5)/100;
    }

    public int tongtien(){
        return tdm() + vdm() + VAT();
    }

    @Override
    public int compareTo(TienDien o){
        return Integer.compare(o.tongtien(),this.tongtien());
    }

    @Override
    public String toString(){
        return id + " " + name + " " + tdm() + " " + vdm() + " " + VAT() + " " + tongtien();
    }
}
