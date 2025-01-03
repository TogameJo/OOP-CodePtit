package baitoanbanhang;

public class HoaDon {
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
    public Long tongtien(){
        return mh.getban() * soluong;
    }

    @Override
    public String toString(){
        return code + " " + kh + " " + mh + " " + soluong + " " + tongtien();
    }
}
