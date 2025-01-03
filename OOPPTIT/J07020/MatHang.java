package J07020;

public class MatHang {
    private String idmh,name,dv;
    private long mua,ban;

    public MatHang(String idmh, String name, String dv, long mua, long ban) {
        this.idmh = idmh;
        this.name = name;
        this.dv = dv;
        this.mua = mua;
        this.ban = ban;
    }

    public String getIdmh() {
        return idmh;
    }

    public String getName() {
        return name;
    }

    public String getDv() {
        return dv;
    }

    public long getMua() {
        return mua;
    }

    public long getBan() {
        return ban;
    }
}
