package J05011;

import java.text.*;

public class TinhGio implements Comparable<TinhGio>{
    private String code,name,vao,ra;
    public TinhGio(String code, String name, String vao, String ra) throws ParseException{
        this.code = code;
        this.name = name;
        this.vao = vao;
        this.ra = ra;
    }

    public long gio() throws ParseException{
        SimpleDateFormat f = new SimpleDateFormat("HH:mm");
        long time = (long) ((f.parse(ra).getTime()-f.parse(vao).getTime())/1000);
        return time;
    }

    @Override
    public String toString() {
        try {
            return code + " " + name + " " + gio()/3600 + " gio " + gio()/60%60 + " phut";
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int compareTo(TinhGio o) {
        try {
            return Long.compare(o.gio(),this.gio());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
