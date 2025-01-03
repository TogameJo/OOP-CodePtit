package J05055;
import java.util.*;
import java.text.*;
public class TinhGio implements Comparable<TinhGio>{
    private String name,xp,ht,code;
    private Date date;

    public TinhGio(String code, String name, String date, String xp, String ht) throws ParseException {
        this.code = code;
        this.name = name;
        this.date = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        this.xp = xp;
        this.ht = ht;
    }

    public int gettuoi(){
        String temp = new SimpleDateFormat("dd/MM/yyyy").format(date);
        int nam = Integer.parseInt(temp.substring(6,10));
        return 2021-nam;
    }

    public int uutien(){
        if(gettuoi() >= 32){
            return 3;
        }else if(gettuoi() >= 25){
            return 2;
        }else if(gettuoi() >= 18){
            return 1;
        }
        return 0;
    }
    public String getuutien(){
        if(gettuoi() >= 32){
            return "00:00:03";
        }else if(gettuoi() >= 25){
            return "00:00:02";
        }else if(gettuoi() >= 18){
            return "00:00:01";
        }
        return "00:00:00";
    }
    public long tgs() throws ParseException {
        SimpleDateFormat f = new SimpleDateFormat("HH:mm:ss");
        long time = (long)((f.parse(ht).getTime() - f.parse(xp).getTime())/1000);
        return time;
    }

    public String ttg() throws ParseException {
        return String.format("%02d",tgs()/3600) + ":" +  String.format("%02d",(tgs()/60)%60) + ":" +  String.format("%02d",(tgs()%60));
    }

    public String thanhtich() throws ParseException {
        long uut = tgs()-uutien();
        return String.format("%02d",uut/3600) + ":" +  String.format("%02d",(uut/60)%60) + ":" +  String.format("%02d",uut%60);
    }
    public long gets() throws ParseException {
        return tgs()-uutien();
    }
    @Override
    public String toString() {
        try {
            return code + " " + name + " " + ttg() + " " + getuutien() + " " + thanhtich();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int compareTo(TinhGio o) {
        try {
            return Long.compare(this.gets(),o.gets());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
