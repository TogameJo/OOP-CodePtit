package J05054;

public class SinhVien implements Comparable<SinhVien>{
    private String name,code;
    private double grade;

    public SinhVien(String code, String name, double grade) {
        this.code = code;
        this.name = name;
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public String xeploai(){
        if(grade >= 9){
            return "Gioi";
        }else if(grade >= 7){
            return "Kha";
        }else if(grade >= 5){
            return "Trung Binh";
        }
        return "Yeu";
    }
    @Override
    public String toString(){
        return code + " " + name + " " + grade + " " + xeploai();
    }

    @Override
    public int compareTo(SinhVien o) {
        return Double.compare(o.grade,this.grade);
    }
}
