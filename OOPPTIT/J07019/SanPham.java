package J07019;

public class SanPham {
    private String id,name;
    private long gia1,gia2;
    public SanPham(String id, String name, long gia1, long gia2) {
        this.id = id;
        this.name = name;
        this.gia1 = gia1;
        this.gia2 = gia2;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getGia1() {
        return gia1;
    }

    public long getGia2() {
        return gia2;
    }
}
