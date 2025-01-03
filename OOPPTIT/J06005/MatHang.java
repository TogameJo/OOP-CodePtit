package J06005;

public class MatHang {
    private String code,name,dv;
    private long mua,ban;
    public MatHang(String code,String name,String dv,long mua,long ban){
        this.code = code;
        this.name = name;
        this.dv = dv;
        this.mua = mua;
        this.ban = ban;
    }

    public String getcode(){
        return code;
    }

    public Long getban(){
        return ban;
    }

    public String toString(){
        return name + " " + dv + " " + mua + " " + ban;
    }
}