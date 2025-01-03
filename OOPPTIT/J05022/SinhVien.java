package J05022;

public class SinhVien{
    private String code,name,cl,em;

    public SinhVien(String code, String name, String cl, String em) {
        this.code = code;
        this.name = name;
        this.cl = cl;
        this.em = em;
    }

    public String getCl() {
        return cl;
    }

    public String toString(){
        return code + " " + name + " " + cl + " " + em;
    }
}
