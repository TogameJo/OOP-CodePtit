package J05010;

public class MatHang implements Comparable<MatHang>{
    private String code,name,loai;
    private double mua,ban;

    public MatHang(String code, String name, String loai, double mua, double ban) {
        this.code = code;
        this.name = name;
        this.loai = loai;
        this.mua = mua;
        this.ban = ban;
    }

    public double loi(){
        return ban-mua;
    }

    @Override
    public int compareTo(MatHang o) {
        return Double.compare(o.loi(),this.loi());
    }

    @Override
    public String toString(){
        return code + " " + name + " " + loai + " " + String.format("%.2f",loi());
    }
}
