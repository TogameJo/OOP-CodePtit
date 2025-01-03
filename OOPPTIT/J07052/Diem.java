package J07052;

import java.util.*;
import java.text.*;
public class Diem {
    private String id,name;
    private double toan,ly,hoa;

    public void chuanhoa(){
        String s = this.name.toLowerCase();
        StringBuilder res = new StringBuilder();
        StringTokenizer tk = new StringTokenizer(s);
        ArrayList<String> word = new ArrayList<>();
        while(tk.hasMoreTokens()){
            word.add(tk.nextToken());
        }
        for(int i = 0;i < word.size();i++){
            if(i >= 1){
                res.append(" ");
            }
            String temps = word.get(i);
            res.append(Character.toUpperCase(temps.charAt(0)));
            res.append(temps.substring(1));
        }
        this.name = res.toString();
    }

    public Diem(String id,String name,double toan,double ly,double hoa){
        this.id = id;
        this.name = name;
        chuanhoa();
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public double diemvung(){
        if(this.id.charAt(2) == '1'){
            return 0.5;
        }else if(this.id.charAt(2) == '2'){
            return 1.0;
        }else if(this.id.charAt(2) == '3'){
            return 2.5;
        }
        return 0;
    }

    public double tongdiem(){

        return this.toan*2+this.ly+this.hoa;
    }

    public double diemsau(){
        return tongdiem()+diemvung();
    }

    public static int compare(Diem a,Diem b){
        if(a.diemsau() == b.diemsau()){
            return a.id.compareTo(b.id);
        }
        return Double.compare(b.diemsau(),a.diemsau());
    }

    public String toString(){
        DecimalFormat df = new DecimalFormat("0.#");
        return id + " " + name + " " + df.format(diemvung()) + " " + df.format(tongdiem() + diemvung());
    }
}
