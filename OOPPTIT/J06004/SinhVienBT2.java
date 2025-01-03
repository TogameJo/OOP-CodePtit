package J06004;

public class SinhVienBT2 {
    private String code,name,sdt;
    private int nhom;
    public SinhVienBT2(String code,String name,String sdt,int nhom){
        this.code = code;
        this.name = name;
        this.sdt = sdt;
        this.nhom = nhom;
    }

    public int getnhom(){
        return nhom;
    }

    public static int compare(SinhVienBT2 a,SinhVienBT2 b){
        return a.code.compareTo(b.code);
    }

    @Override
    public String toString(){
        return code + " " + name + " " + sdt + " " + nhom;
    }
}
