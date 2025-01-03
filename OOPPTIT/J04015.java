import java.util.*;
public class J04015 {
    static class gvien{
        String mgv,name;
        long lcb;
        public void get(Scanner sc){
            mgv = sc.nextLine();
            name = sc.nextLine();
            lcb = sc.nextLong();
        }
    }
    static void in(gvien a){
        long pc = 0;
        if(a.mgv.charAt(0) == 'H' && a.mgv.charAt(1) == 'T'){
            pc = 2000000;
        }else if(a.mgv.charAt(0) == 'H' && a.mgv.charAt(1) == 'P'){
            pc = 900000;
        }else if(a.mgv.charAt(0) == 'G'){
            pc = 500000;
        }
        long hs = 0;
        if(a.mgv.charAt(2) == '0'){
            hs = a.mgv.charAt(3)-'0';
        }else if(a.mgv.charAt(2) != '0'){
            hs = Integer.parseInt(a.mgv.substring(2,4));
        }
        long sum = (a.lcb * (long) hs)+pc;
        System.out.printf("%s %s %d %d %d",a.mgv,a.name,hs,pc,sum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        gvien a = new gvien();
        a.get(sc);
        in(a);
        sc.close();
    }
}
