package J07058;

public class MonHoc implements Comparable<MonHoc>{
    private String code,name,ht;

    public MonHoc(String code, String name, String ht) {
        this.code = code;
        this.name = name;
        this.ht = ht;
    }

    @Override
    public int compareTo(MonHoc o) {
        return this.code.compareTo(o.code);
    }

    @Override
    public String toString() {
        return code + " " + name + " " + ht;
    }
}
