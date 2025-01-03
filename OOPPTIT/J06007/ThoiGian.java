package J06007;

public class ThoiGian {
    private GiangVien gv;
    private ThoiGian tg;
    private double time;
    public ThoiGian(GiangVien gv, double time){
        this.gv = gv;
        this.time = time;
    }

    @Override
    public String toString(){
        return gv + " " + String.format("%.2f",time);
    }

}
