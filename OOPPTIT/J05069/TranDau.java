package J05069;

public class TranDau implements Comparable<TranDau>{
    private String code;
    private long sl;
    private CLB clb;

    public TranDau(String code, long sl,CLB clb) {
        this.code = code;
        this.sl = sl;
        this.clb = clb;
    }

    public long tong(){
        return clb.getGv()*sl;
    }

    @Override
    public String toString(){
        return code + " " + clb.getName() + " " + tong();
    }

    @Override
    public int compareTo(TranDau o) {
        if(this.tong() == o.tong()){
            return this.clb.getName().compareTo(o.clb.getName());
        }
        return Long.compare(o.tong(),this.tong());
    }
}