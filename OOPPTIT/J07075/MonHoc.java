package J07075;

public class MonHoc {
    private String code,name;
    private int tc;

    public MonHoc(String code, String name, int tc) {
        this.code = code;
        this.name = name;
        this.tc = tc;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getTc() {
        return tc;
    }
}
