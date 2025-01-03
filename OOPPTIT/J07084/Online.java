package J07084;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Online implements Comparable<Online>{
    private String name, time1, time2;
    private Date date1, date2;

    public Online(String name, String date1, String time1, String date2, String time2) throws ParseException {
        this.name = name;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        this.date1 = dateFormat.parse(date1);
        this.time1 = time1;
        this.date2 = dateFormat.parse(date2);
        this.time2 = time2;
    }


    public long ngayToPhut() {
        long milliseconds = this.date2.getTime() - this.date1.getTime();
        return milliseconds / (1000 * 60);
    }


    public int chuyendoi1() {
        String[] parts = this.time1.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        return hours * 60 + minutes;
    }


    public int chuyendoi2() {
        String[] parts = this.time2.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        return hours * 60 + minutes;
    }

    public long tongPhut() {
        return ngayToPhut() + (chuyendoi2() - chuyendoi1());
    }

    @Override
    public int compareTo(Online o) {
        return Long.compare(o.tongPhut(),this.tongPhut());
    }

    @Override
    public String toString() {
        return name + " " + tongPhut();
    }
}
