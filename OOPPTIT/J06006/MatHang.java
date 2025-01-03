package J06006;

public class MatHang {
    private String code,name,dv;
    private long mua, ban;
    public MatHang(String code,String name,String dv,long mua,long ban){
        this.code = code;
        this.name = name;
        this.dv = dv;
        this.mua = mua;
        this.ban = ban;
    }

    public String getCode() {
        return code;
    }

    public long getMua() {
        return mua;
    }

    public long getBan() {
        return ban;
    }

    @Override
    public String toString(){
        return name;
    }
}
