package J06005;

public class HoaDon {
    private String code;
    private KhachHang kh;
    private MatHang mh;
    private int cnt;
    public HoaDon(String code,KhachHang kh,MatHang mh,int cnt){
        this.code =code;
        this.kh = kh;
        this.mh = mh;
        this.cnt = cnt;
    }

    public Long tongtien(){
        return mh.getban()*cnt;
    }

    public String toString(){
        return code + " " + kh + " " + mh + " " + cnt+ " " + tongtien();
    }
}
