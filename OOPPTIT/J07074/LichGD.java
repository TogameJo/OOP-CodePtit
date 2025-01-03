package J07074;

public class LichGD implements Comparable<LichGD>{
    private String mn,name,room,code;
    private int thu,kip;
    private MonHoc mh;

    public LichGD(String mn,String code, int thu, int kip, String name, String room, MonHoc mh) {
        this.code = code;
        this.thu = thu;
        this.kip = kip;
        this.name = name;
        this.room = room;
        this.mn = mn;
        this.mh = mh;
    }

    public String getname(){
        return mh.getName();
    }

    public String getCode() {
        return code;
    }
    public String toString(){
        return mn + " " + thu + " " + kip + " " + name + " " + room;
    }

    @Override
    public int compareTo(LichGD o) {
        if(this.thu == o.thu){
            if(this.kip == o.kip){
                return this.name.compareTo(o.name);
            }
            return Integer.compare(this.kip,o.kip);
        }
        return Integer.compare(this.thu,o.thu);
    }
}
