package J05074;

public class SinhVien {
    private String name,code,cl;

    public SinhVien(String code, String name, String cl) {
        this.code = code;
        this.name = name;
        this.cl = cl;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString(){
        return code + " " + name + " " + cl;
    }
}
