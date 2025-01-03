package J05052;

public class DonHang implements Comparable<DonHang>{
    private String name,code;
    private long dg;
    private int sl;

    public DonHang(String name, String code, long dg, int sl) {
        this.name = name;
        this.code = code;
        this.dg = dg;
        this.sl = sl;
    }

    public long giamgia(){
        if(code.charAt(code.length()-1) == '1'){
            return (long)(0.5*dg)*sl;
        }
        return (long)(0.3*dg)*sl;
    }
    public String gettt(){
        return code.substring(1,4);
    }
    public long tt(){
        return (dg*sl)-giamgia();
    }

    @Override
    public String toString(){
        return name + " " + code + " " + gettt() + " " + giamgia() + " " + tt();
    }

    @Override
    public int compareTo(DonHang o) {
        return this.gettt().compareTo(o.gettt());
    }
}
