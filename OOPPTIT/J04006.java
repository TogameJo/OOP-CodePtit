import java.util.*;
public class J04006 {
    static class sinhvien{
        String ten,lop,date;
        String msv = "B20DCCN001";
        double gpa;
        public void get(Scanner sc){
            ten = sc.nextLine();
            lop = sc.nextLine();
            date = sc.nextLine();
            gpa = sc.nextDouble();
        }
    }
    static void in(sinhvien a){
        StringBuilder s = new StringBuilder(a.date);
        if(s.charAt(1) == '/'){
            s.insert(0,"0");
        }
        if(s.charAt(4) == '/'){
            s.insert(3,"0");
        }
        System.out.printf("%s %s %s %s %.2f",a.msv,a.ten,a.lop,s,a.gpa);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sinhvien a = new sinhvien();
        a.get(sc);
        in(a);
    }
}
