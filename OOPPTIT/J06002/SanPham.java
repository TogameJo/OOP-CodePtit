package J06002;

public class SanPham {
    private String code,name;
    private long gia1,gia2;
    public SanPham(String code,String name,long gia1,long gia2){
        this.code = code;
        this.name = name;
        this.gia1 = gia1;
        this.gia2 = gia2;
    }

    public String getCode() {
        return code;
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
