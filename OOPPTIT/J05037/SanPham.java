package J05037;

public class SanPham implements Comparable<SanPham>{
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
        long gb = Math.round((double)(tt()+(tt()*0.02))/sl);
        if(gb % 100 != 0){
            gb = gb - gb%100 + 100;
        }
        return gb;
    }

    @Override
    public String toString(){
        return code + " " + name + " " + dv + " " + pvc() + " " + tt() + " " + gb();
    }

    @Override
    public int compareTo(SanPham o) {
        return Long.compare(o.gb(),this.gb());
    }
}
