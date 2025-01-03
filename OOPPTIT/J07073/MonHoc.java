package J07073;

public class MonHoc implements Comparable<MonHoc>{
    private String code,name,lt,th;
    private int tc;

    public MonHoc(String code, String name, int tc, String lt, String th) {
        this.code = code;
        this.name = name;
        this.tc = tc;
        this.lt = lt;
        this.th = th;
    }

    public String getTh() {
        return th;
    }

    @Override
    public int compareTo(MonHoc o) {
        return this.code.compareTo(o.code);
    }

    @Override
    public String toString(){
        return code + " " + name + " " + tc + " " + lt + " " + th;
    }
}
