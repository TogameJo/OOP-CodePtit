package J06005;

public class KhachHang {
    private String code,name,sex,date,add;
    public KhachHang(String code,String name,String sex,String date,String add){
        this.code = code;
        this.name = name;
        this.sex = sex;
        this.date = date;
        this.add = add;
    }

    public String getcode(){
        return code;
    }

    public String toString(){
        return name + " " + add;
    }
}
