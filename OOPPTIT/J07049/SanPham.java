package J07049;

public class SanPham {
    private String id,name;
    private int gia;
    private int bh;

    public SanPham(String id, String name, int gia, int bh) {
        this.id = id;
        this.name = name;
        this.gia = gia;
        this.bh = bh;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGia() {
        return gia;
    }

    public int getBh() {
        return bh;
    }
}
