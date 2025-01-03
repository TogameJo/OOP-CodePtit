package J06002;

public class HoaDon {
    private String code;
    private SanPham sp;
    private int sl;
    public HoaDon(String code,SanPham sp,int sl){
        this.code = code;
        this.sp =sp;
        this.sl=sl;
    }

    public long donggia(){
        if(code.charAt(2) == '1'){
            return sp.getGia1()*sl;
        }else if(code.charAt(2) == '2'){
            return sp.getGia2()*sl;
        }
        return 0;
    }

    public long giamgia(){
        if(sl >= 150){
            if(code.charAt(2) == '1'){
                return (sp.getGia1()*sl*50)/100;
            }else{
                return (sp.getGia2()*sl*50)/100;
            }
        }else if(sl >= 100){
            if(code.charAt(2) == '1'){
                return (sp.getGia1()*sl*30)/100;
            }else{
                return (sp.getGia2()*sl*30)/100;
            }
        }else if(sl >= 50){
            if(code.charAt(2) == '1'){
                return (sp.getGia1()*sl*15)/100;
            }else{
                return (sp.getGia2()*sl*15)/100;
            }
        }
        return 0;
    }

    public long tongtien(){
        return donggia() - giamgia();
    }

    public static int compare(HoaDon a,HoaDon b){
        return Long.compare(b.tongtien(),a.tongtien());
    }

    @Override
    public String toString(){
        return code + " " + sp + " " + giamgia() + " " + tongtien();
    }
}
