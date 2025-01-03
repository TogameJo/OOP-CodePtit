package J07081;

public class SinhVien implements Comparable<SinhVien>{
    private String code,name,sdt,em;

    public SinhVien(String code, String name, String sdt, String em) {
        this.code = code;
        this.name = name;
        this.sdt = sdt;
        this.em = em;
    }
    public String getten(){
        String[] w = this.name.split(" ");
        return w[w.length-1];
    }
    public String getho(){
        String[] w = this.name.split(" ");
        return w[0];
    }
    public String getdem(){
        String[] w = this.name.split(" ");
        StringBuilder s = new StringBuilder();
        for(int i = 1;i < w.length-1;i++){
            if(i >= 1){
                s.append(" ");
            }
            s.append(w[i]);
        }
        return s.toString();
    }

    @Override
    public int compareTo(SinhVien o) {
        if(this.getten().equals(o.getten())){
            if(this.getho().equals(o.getho())){
                if(this.getdem().equals(o.getdem())){
                    return this.code.compareTo(o.code);
                }
                return this.getdem().compareTo(o.getdem());
            }
            return this.getho().compareTo(o.getho());
        }
        return this.getten().compareTo(o.getten());
    }

    @Override
    public String toString(){
        return code + " " + name + " " + sdt + " " + em;
    }
}
