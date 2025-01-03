package J05038;

public class TienLuong {
    private String code,name,cv;
    private int sn;
    private long luong;

    public TienLuong(String code, String name, long luong, int sn, String cv) {
        this.code = code;
        this.name = name;
        this.luong = luong;
        this.sn = sn;
        this.cv = cv;
    }

    public long lt(){
        return luong*sn;
    }
    public long thuong(){
        if(sn >= 25){
            return (long)(lt()*0.2);
        }else if(sn >= 22){
            return (long)(lt()*0.1);
        }
        return 0;
    }
    public long pc(){
        if(cv.equals("GD")){
            return 250000;
        }else if(cv.equals("PGD")){
            return 200000;
        }else if(cv.equals("TP")){
            return 180000;
        }
        return 150000;
    }
    public long tong(){
        return lt() + thuong() + pc();
    }

    @Override
    public String toString(){
        return code + " " + name + " " + lt() + " " + thuong() + " " + pc() + " " + tong();
    }
}
