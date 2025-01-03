package J05027;

import java.util.*;

public class Gvien {
    private String code,name,mh;

    public Gvien(String code, String name, String mh) {
        this.code = code;
        this.name = name;
        this.mh = mh;
    }

    public String getName() {
        return name;
    }
    public String monhoc(){
        StringTokenizer tk = new StringTokenizer(this.mh);
        ArrayList<String> w = new ArrayList<>();
        while(tk.hasMoreTokens()){
            w.add(tk.nextToken());
        }
        StringBuilder res = new StringBuilder();
        for(int i = 0;i < w.size();i++){
            String temp = w.get(i);
            res.append(Character.toUpperCase(temp.charAt(0)));
        }
        return res.toString();
    }
    @Override
    public String toString(){
        return code + " " + name + " " + monhoc();
    }
}
