package J07054;

import java.util.ArrayList;
import java.util.StringTokenizer;
import java.math.*;
import java.text.*;

public class BangDiem {
    private String id,name;
    private double d1,d2,d3;

    public void chuanhoa(){
        String s = this.name.toLowerCase();
        StringTokenizer tk = new StringTokenizer(s);
        ArrayList<String> word = new ArrayList<>();
        while(tk.hasMoreTokens()){
            word.add(tk.nextToken());
        }
        StringBuilder res = new StringBuilder();
        for(int i = 0;i < word.size();i++){
            String tmp = word.get(i);
            if(i >= 1){
                res.append(" ");
            }
            res.append(Character.toUpperCase(tmp.charAt(0)));
            res.append(tmp.substring(1));
        }
        this.name = res.toString();
    }

    public BangDiem(String id, String name, double d1, double d2, double d3) {
        this.id = id;
        this.name = name;
        chuanhoa();
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public double diemchuan(){
        double dc = (d1*3+d2*3+d3*2)/8;
        return dc;
    }

    public static int compare(BangDiem a, BangDiem b){
        if(a.diemchuan() == b.diemchuan()){
            return a.id.compareTo(b.id);
        }
        return Double.compare(b.diemchuan(),a.diemchuan());
    }
    @Override
    public String toString(){
        BigDecimal dc = new BigDecimal(diemchuan()).setScale(2, RoundingMode.HALF_UP);
        //Sử dụng setScale(2, RoundingMode.HALF_UP) để làm tròn đến 2 chữ số thập phân, với chế độ làm tròn nửa lên.
        return id + " " + name + " " +String.format("%.2f",dc.doubleValue());
    }
}
