package J05044;

public class NhanVien {
    private String code,name,cv;
    private long lcb,snc;
    private static int cnt;
    public NhanVien(String name, String cv,long lcb, long snc) {
        cnt++;
        this.code = "NV" + String.format("%02d",cnt);
        this.name = name;
        this.cv = cv;
        this.lcb = lcb;
        this.snc = snc;
    }

    public String getCv() {
        return cv;
    }

    public long pc(){
        if(cv.equals("GD")){
            return 500;
        }else if(cv.equals("PGD")){
            return 400;
        }else if(cv.equals("TP")){
            return 300;
        }else if(cv.equals("KT")){
            return 250;
        }
        return 100;
    }
    public long lc(){
        return lcb*snc;
    }

    public long tu(){
        if((pc()+lc()) * 2/3 < 25000){
            return Math.round((double)((pc()+lc())*2/3) / 1000)*1000;
        }
        return 25000;
    }

    public long conlai(){
        return (lc()-tu())+pc();
    }

    @Override
    public String toString(){
        return code + " " + name + " " + pc() + " " + lc() + " " + tu() + " " + conlai();
    }
}
