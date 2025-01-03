package J06001;

public class HoaDon {
    private String ma;
    private SanPham sp;
    private int soluong;
    public HoaDon(String ma,SanPham sp,int soluong){
        this.ma = ma;
        this.sp = sp;
        this.soluong = soluong;
    }

    public long dongia(){
        if(ma.charAt(2) == '1'){
            return sp.getGia1()*soluong;
        }else if(ma.charAt(2) == '2') {
            return sp.getGia2() * soluong;
        }
        return 0;
    }

    public long giamgia(){
        if (soluong >= 150) {
            if (ma.charAt(2) == '1') {
                return (sp.getGia1() * soluong * 50) / 100;
            } else {
                return (sp.getGia2() * soluong * 50) / 100;
            }
        } else if (soluong >= 100) {
            if (ma.charAt(2) == '1') {
                return (sp.getGia1() * soluong * 30) / 100;
            } else {
                return (sp.getGia2() * soluong * 30) / 100;
            }
        } else if (soluong >= 50) {
            if (ma.charAt(2) == '1') {
                return (sp.getGia1() * soluong * 15) / 100;
            } else {
                return (sp.getGia2() * soluong * 15) / 100;
            }
        } else {
            return 0;
        }
    }

    public long tongtien(){
        return dongia() - giamgia();
    }

    @Override
    public String toString(){
        return ma + " " + sp + " " + giamgia() + " " + tongtien();
    }
}
