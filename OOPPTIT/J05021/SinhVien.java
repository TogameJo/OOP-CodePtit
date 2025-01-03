package J05021;

public class SinhVien implements Comparable<SinhVien>{
    private String code,name,cl,em;

    public SinhVien(String code, String name, String cl, String em) {
        this.code = code;
        this.name = name;
        this.cl = cl;
        this.em = em;
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.code.compareTo(o.code);
    }

    @Override
    public String toString(){
        return code + " " + name + " " + cl + " " + em;
    }
}
