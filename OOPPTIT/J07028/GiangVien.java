package J07028;

public class GiangVien {
    private String code,name;
    private double sum;
    public GiangVien(String code, String name) {
        this.code = code;
        this.name = name;
        this.sum = 0.0;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    @Override
    public String toString(){
        return name + " " + String.format("%.2f",sum);
    }
}
