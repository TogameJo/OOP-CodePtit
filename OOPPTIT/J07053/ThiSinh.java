package J07053;

import java.util.*;
import java.text.*;

public class ThiSinh {
    private String id,name;
    private Date date;
    private double lt,th;
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
    public ThiSinh(String id, String name,String date,double lt,double th) throws ParseException{
        this.id = id;
        this.name = name;
        chuanhoa();
        this.date = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        this.lt = lt;
        this.th = th;
    }
    public double diemchuan(){
        return (this.lt+this.th)/2;
    }
    public double diemthuong(){
        if(this.lt >= 8 && this.th >= 8){
            return 1.0;
        }else if(this.lt >= 7.5 && this.th >= 7.5){
            return 0.5;
        }
        return 0;
    }
    public int diemxet(){
        double dx = diemchuan()+diemthuong();
        return (int)Math.min(Math.round(dx), 10);
    }
    public int tuoi(){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int namsinh = calendar.get(Calendar.YEAR);
        return 2021-namsinh;
    }

    @Override
    public String toString(){
        return id + " " + name + " " + tuoi() + " " + diemxet();
    }
}
