package J06001;

public class SanPham {
    private String ma,name;
    private long gia1,gia2;
    public SanPham(String ma,String name,long gia1,long gia2){
        this.ma = ma;
        this.name = name;
        this.gia1 = gia1;
        this.gia2 = gia2;
    }

    public String getMa() {
        return ma;
    }

    public long getGia1() {
        return gia1;
    }

    public long getGia2() {
        return gia2;
    }

    @Override
    public String toString(){
        return name;
    }
}
