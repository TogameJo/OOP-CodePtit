import java.util.*;
public class J04007 {
    static class nhanvien{
        String name,sex,bi,add,tax,date;
        String mnv = "00001";
        public void get(Scanner sc){
            name = sc.nextLine();
            sex = sc.nextLine();
            bi = sc.nextLine();
            add = sc.nextLine();
            tax = sc.nextLine();
            date = sc.nextLine();
        }
    }
    static void in(nhanvien a){
        System.out.printf("%s %s %s %s %s %s %s",a.mnv,a.name,a.sex,a.bi,a.add,a.tax,a.date);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        nhanvien a = new nhanvien();
        a.get(sc);
        in(a);
        sc.close();
    }
}
