package J06006;

public class HoaDon implements Comparable<HoaDon>{
    private String code;
    private KhachHang kh;
    private MatHang mh;
    private int soluong;

    public HoaDon(String code,KhachHang kh,MatHang mh,int soluong){
        this.code = code;
        this.kh = kh;
        this.mh = mh;
        this.soluong = soluong;
    }

    public long loinhuan(){
        return (mh.getBan()*soluong)-(mh.getMua()*soluong);
    }
    public long tongtien(){
        return mh.getBan()*soluong;
    }

    public int compareTo(HoaDon a){
        return Long.compare(a.loinhuan(),this.loinhuan());
    }

    @Override
    public String toString(){
        return code + " " + kh + " " + mh + " " + soluong + " " + tongtien() + " " +loinhuan();
    }
}
