package J07020;

public class KhachHang {
    private String idkh,name,sex,date,add;

    public KhachHang(String idkh, String name, String sex, String date, String add) {
        this.idkh = idkh;
        this.name = name;
        this.sex = sex;
        this.date = date;
        this.add = add;
    }

    public String getIdkh() {
        return idkh;
    }

    public String getName() {
        return name;
    }

    public String getAdd() {
        return add;
    }
}
