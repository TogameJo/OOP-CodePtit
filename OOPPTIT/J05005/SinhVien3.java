package J05005;
import java.util.*;
import java.text.*;

public class SinhVien3 {
    private String code,name,cl;
    private Date date;
    private Double gpa;
    private static int cnt = 0;
    public void chuanhoa(){
        String s = this.name.toLowerCase();
        StringTokenizer tk = new StringTokenizer(s);
        ArrayList<String> word = new ArrayList<>();
        while(tk.hasMoreTokens()){
            word.add(tk.nextToken());
        }
        int n = word.size();
        StringBuilder res = new StringBuilder();
        for(int i = 0;i < n;i++){
            if(i >= 1){
                res.append(" ");
            }
            String ans = word.get(i);
            res.append(Character.toUpperCase(word.get(i).charAt(0)));
            res.append(ans.substring(1));
        }
        this.name = res.toString();
    }
    public static Comparator<SinhVien3> ss() {
        return new Comparator<SinhVien3>() {
            public int compare(SinhVien3 a, SinhVien3 b) {
                return b.gpa.compareTo(a.gpa); // Sắp xếp giảm dần
            }
        };
    }
    public SinhVien3(String name,String cl,String date,Double gpa) throws ParseException{
        cnt++;
        this.code = String.format("B20DCCN" + "%03d",cnt);
        this.name = name;
        chuanhoa();
        this.cl = cl;
        this.date = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        this.gpa = gpa;
    }
    public String toString(){
        return code + " " + name + " " + cl + " " + new SimpleDateFormat("dd/MM/yyyy").format(date) + " " +String.format("%.2f",gpa);
    }
}
