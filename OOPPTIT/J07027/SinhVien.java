package J07027;

public class SinhVien implements Comparable<SinhVien>{
    private String code,name,sdt;

    public SinhVien(String code, String name, String sdt) {
        this.code = code;
        this.name = name;
        this.sdt = sdt;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString(){
        return code + " " + name + " " + sdt;
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.code.compareTo(o.code);
    }
}
