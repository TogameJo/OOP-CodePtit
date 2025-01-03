package J05015;

import java.util.*;
import java.text.*;

public class ThiSinh implements Comparable<ThiSinh>{
    private String code,name,dv,time;

    public ThiSinh(String name, String dv, String time) {
        StringTokenizer tk = new StringTokenizer(dv);
        ArrayList<String> w = new ArrayList<>();
        while(tk.hasMoreTokens()){
            w.add(tk.nextToken());
        }
        StringBuilder res = new StringBuilder();
        for(int i = 0;i < w.size();i++){
            res.append(w.get(i).charAt(0));
        }

        StringTokenizer tk2 = new StringTokenizer(name);
        ArrayList<String> w2 = new ArrayList<>();
        while(tk2.hasMoreTokens()){
            w2.add(tk2.nextToken());
        }
        StringBuilder res2 = new StringBuilder();
        for(int i = 0;i < w2.size();i++){
            res2.append(w2.get(i).charAt(0));
        }
        this.code = res.toString()+ res2;
        this.name = name;
        this.dv = dv;
        this.time = time;
    }
    public long gets() throws ParseException{
        String xp = "6:00";
        SimpleDateFormat f = new SimpleDateFormat("H:mm");
        long tinhs = (long)((f.parse(time).getTime() - f.parse(xp).getTime())/1000);
        return tinhs;
    }
    public long vantoc() throws ParseException {
        double speed = (120*3600/(double)gets());
        if(speed % 1 >= 0.5){
            return (long)Math.ceil(speed);
        }
        return (long) Math.floor(speed);
    }
    @Override
    public String toString(){
        try{
            return code + " " + name + " " + dv + " " + vantoc()+" Km/h";
        }catch(ParseException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public int compareTo(ThiSinh o) {
        return this.time.compareTo(o.time);
    }
}
