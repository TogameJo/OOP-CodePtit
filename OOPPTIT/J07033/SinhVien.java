package J07033;
import java.util.*;
public class SinhVien {
    private String msv,name,lop,email;
    public void chuanhoa(){
        String s = this.name.toLowerCase();
        StringTokenizer tk = new StringTokenizer(s);
        ArrayList<String> a = new ArrayList<>();
        while(tk.hasMoreTokens()){
            a.add(tk.nextToken());
        }
        StringBuilder res = new StringBuilder();
        for(int i = 0;i < a.size();i++){
            if(i >= 1){
                res.append(" ");
            }
            String temp = a.get(i);
            res.append(Character.toUpperCase(temp.charAt(0))).append(temp.substring(1));
        }
        this.name = res.toString();
    }
    public SinhVien(String msv, String name, String lop, String email){
        this.msv = msv;
        this.name = name;
        chuanhoa();
        this.lop = lop;
        this.email = email;
    }
    public static int compare(SinhVien a, SinhVien b) {
        return a.msv.compareTo(b.msv);
    }
    public String toString(){
        return msv + " " + name + " " + lop + " " + email;
    }
}
