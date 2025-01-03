package J06003;

public class SinhVienBT {
    private String code,name,sdt;
    private int nhom;
    public SinhVienBT(String code, String name, String sdt, int nhom){
        this.code = code;
        this.name = name;
        this.sdt =sdt;
        this.nhom = nhom;
    }

    public int getnhom(){
        return nhom;
    }

    @Override
    public String toString(){
        return code + " " + name + " " + sdt;
    }
}
