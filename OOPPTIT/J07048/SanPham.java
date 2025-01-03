package J07048;

public class SanPham{
    private String msp,name;
    private int gia,baohanh;
    public SanPham(String msp,String name,int gia,int baohanh){
        this.msp = msp;
        this.name = name;
        this.gia = gia;
        this.baohanh = baohanh;
    }

    public static int compare(SanPham a, SanPham b){
        if(a.gia == b.gia){
            return a.msp.compareTo(b.msp);
        }
        return Integer.compare(b.gia,a.gia);
    }

    @Override
    public String toString(){
        return msp + " " + name + " " + gia + " " + baohanh;
    }

}
