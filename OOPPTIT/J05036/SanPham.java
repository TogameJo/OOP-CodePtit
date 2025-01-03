package J05036;

public class SanPham {
    private String code,name,dv;
    private long gn,sl;

    public SanPham(String code, String name, String dv, long gn, long sl) {
        this.code = code;
        this.name = name;
        this.dv = dv;
        this.gn = gn;
        this.sl = sl;
    }

    public long pvc(){
        return Math.round((double)(gn*sl)*0.05);
    }

    public long tt(){
        return Math.round((double)(gn*sl)+pvc());
    }

    public long gb(){
        return tt() + Math.round((double)tt()*0.02);
    }

    @Override
    public String toString(){
        return code + " " + name + " " + dv + " " + pvc() + " " + tt() + " " + gb();
    }
}
