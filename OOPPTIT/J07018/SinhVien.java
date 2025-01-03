package J07018;

import java.text.*;
import java.util.*;

public class SinhVien {
    private String code,name,cl;
    private Date date;
    private float gpa;

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

    public SinhVien(String code, String name, String cl, String date, float gpa)throws ParseException{
        this.code = code;
        this.name = name;
        chuanhoa();
        this.cl = cl;
        this.date = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        this.gpa = gpa;
    }

    @Override
    public String toString(){
        return code + " " + name + " " + cl + " " + new SimpleDateFormat("dd/MM/yyyy").format(date) + " " + String.format("%.2f",gpa);
    }

}
