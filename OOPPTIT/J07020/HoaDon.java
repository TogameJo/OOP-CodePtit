package J07020;

public class HoaDon {
    private String idhd,idkh,idmh;
    private int sl;
    private KhachHang kh;
    private MatHang mh;

    public HoaDon(String idhd, int sl, KhachHang kh, MatHang mh) {
        this.idhd = idhd;
        this.sl = sl;
        this.kh = kh;
        this.mh = mh;
    }

    public long gia(){
        return mh.getBan() * sl;
    }

    @Override

    public String toString(){
        return idhd + " " + kh.getName() + " " + kh.getAdd() + " " + mh.getName() + " " + mh.getDv() + " " + mh.getMua() + " " + mh.getBan() + " " + sl + " " + gia();
    }
}
