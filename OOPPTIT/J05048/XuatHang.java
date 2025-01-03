package J05048;

public class XuatHang implements Comparable<XuatHang>{
    private String code;
    private int nhap;

    public XuatHang(String code, int nhap) {
        this.code = code;
        this.nhap = nhap;
    }

    public long xuat(){
        if(code.charAt(0) == 'A'){
            return Math.round((double)nhap*0.6);
        }
        return Math.round((double)nhap*0.7);
    }
    public char getdau(){
        return code.charAt(0);
    }
    public long dongia(){
        if(code.charAt(code.length()-1) == 'Y'){
            return 110000;
        }
        return 135000;
    }
    public long tien(){
        return xuat()*dongia();
    }
    public long thue(){
        char dau = code.charAt(0);
        char cuoi = code.charAt(code.length()-1);
        if(dau == 'A' && cuoi == 'Y'){
            return (long) (tien()*0.08);
        }else if(dau == 'A' && cuoi == 'N'){
            return (long) (tien()*0.11);
        }else if(dau == 'B' && cuoi == 'Y'){
            return (long) (tien()*0.17);
        }
        return (long) (tien()*0.22);
    }
    @Override
    public String toString(){
        return code + " " + nhap + " " + xuat() + " " + dongia() + " " + tien() + " " + thue();
    }

    @Override
    public int compareTo(XuatHang o) {
        return Long.compare(o.thue(),this.thue());
    }
}
