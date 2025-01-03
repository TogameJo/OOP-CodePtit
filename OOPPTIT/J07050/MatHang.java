package J07050;

public class MatHang {
    private String id,name,gr;
    private Double mua,ban;
    public MatHang(String id,String name,String gr,double mua,double ban){
        this.id = id;
        this.name = name;
        this.gr = gr;
        this.mua = mua;
        this.ban = ban;
    }
    public double loinhuan(){
        return this.ban - this.mua;
    }
    public static int compare(MatHang c,MatHang b){
        return Double.compare(b.loinhuan(),c.loinhuan());
    }

    public String toString(){
        return id + " " + name + " " + gr + " " +String.format("%.2f",loinhuan());
    }
}
