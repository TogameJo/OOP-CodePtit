package J05047;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class NhapKho implements Comparable<NhapKho>{
    private String code,name;
    private int sl;
    private long gia;
    private static HashMap<String,Integer> mp = new HashMap<>();

    public NhapKho(String name, int sl, long gia) {
        StringTokenizer tk = new StringTokenizer(name);
        ArrayList<String> w = new ArrayList<>();
        while(tk.hasMoreTokens()){
            w.add(tk.nextToken());
        }
        StringBuilder ans = new StringBuilder();
        StringBuilder res = new StringBuilder();
        for(int i = 0;i < 2;i++){
            if(i == 1){
                res.append(" ");
            }
            res.append(w.get(i));
            ans.append(Character.toUpperCase(w.get(i).charAt(0)));
        }
        String temp = res.toString();
        if(mp.get(temp) == null){
            mp.put(temp,1);
        }else{
            mp.put(temp,mp.get(temp)+1);
        }
        this.code = ans + String.format("%02d",mp.get(temp));
        this.name = name;
        this.sl = sl;
        this.gia = gia;
    }

    public long tck(){
        if(sl >= 10){
            return (long) (gia*sl*0.05);
        }else if(sl >= 8){
            return (long) (gia*sl*0.02);
        }else if(sl >= 5){
            return (long) (gia*sl*0.01);
        }
        return 0;
    }

    public long thanhtien(){
        return gia*sl-tck();
    }

    @Override
    public String toString(){
        return code + " " + name + " " + tck() + " " + thanhtien();
    }

    @Override
    public int compareTo(NhapKho o) {
        return Long.compare(o.tck(),this.tck());
    }
}
