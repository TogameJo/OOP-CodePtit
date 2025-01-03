package J07019;

public class HoaDon {
    private String id;
    private int sl;
    private SanPham sp;

    public HoaDon(String id, int sl, SanPham sp) {
        this.id = id;
        this.sl = sl;
        this.sp = sp;
    }

    public long thanhtien(){
        if(id.charAt(2) == '1'){
            return sp.getGia1()*sl;
        }
        return sp.getGia2()*sl;
    }

    public long giamgia(){
        if(sl >= 150){
            return (long)(0.5*thanhtien());
        }else if(sl >= 100){
            return (long)(0.3*thanhtien());
        }else if(sl >= 50){
            return (long)(0.15*thanhtien());
        }
        return 0;
    }

    public long tongtien(){
        return thanhtien()-giamgia();
    }

    @Override
    public String toString(){
        return id + " " + sp.getName() + " " + giamgia() + " " + tongtien();
    }
}
