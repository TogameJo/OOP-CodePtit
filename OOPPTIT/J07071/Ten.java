package J07071;

import java.util.*;

public class Ten implements Comparable<Ten>{
    private String name;

    public Ten(String name) {
        this.name = name;
    }

    public String ho(){
        String s = this.name;
        StringTokenizer tk = new StringTokenizer(s);
        ArrayList<String> w = new ArrayList<>();
        while(tk.hasMoreTokens()){
            w.add(tk.nextToken());
        }
        return w.get(0);
    }

    public String ten(){
        String s = this.name;
        StringTokenizer tk = new StringTokenizer(s);
        ArrayList<String> w = new ArrayList<>();
        while(tk.hasMoreTokens()){
            w.add(tk.nextToken());
        }
        return w.get(w.size()-1);
    }
    public String tenvt(){
        String s = this.name;
        StringTokenizer tk = new StringTokenizer(s);
        ArrayList<String> w = new ArrayList<>();
        while(tk.hasMoreTokens()){
            w.add(tk.nextToken());
        }
        StringBuilder res = new StringBuilder();
        for(int i = 0;i < w.size()-1;i++){
            String temp = w.get(i);
            res.append(Character.toUpperCase(temp.charAt(0)));
            res.append(".");
        }
        res.append("*");
        return res.toString();
    }

    @Override
    public int compareTo(Ten o) {
        if(this.ten().equals(o.ten())){
            return this.ho().compareTo(o.ho());
        }
        return this.ten().compareTo(o.ten());
    }

    @Override
    public String toString(){
        return name;
    }
}
