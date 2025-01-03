/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07072;
import java.util.*;
/**
 *
 * @author Lenovo
 */
public class DANHSACH implements Comparable<DANHSACH>{
    private String name;
    
    public void chuanhoa(){
        String s = this.name.toLowerCase();
        StringTokenizer tk = new StringTokenizer(s);
        ArrayList<String> w = new ArrayList<>();
        while(tk.hasMoreTokens()){
            w.add(tk.nextToken());
        }
        StringBuilder res = new StringBuilder();
        for(int i = 0;i < w.size();i++){
            String temp = w.get(i);
            if(i >= 1){
                res.append(" ");
            }
            res.append(Character.toUpperCase(temp.charAt(0)));
            res.append(temp.substring(1));
        }
        this.name = res.toString();
    }
    public DANHSACH(String name){
        this.name = name;
        chuanhoa();
    }
    public String ten(){
        String[] w = this.name.split(" ");
        return w[w.length-1];
    }
    public String ho(){
        String[] w = this.name.split(" ");
        return w[0];
    }
    public String dem(){
        StringBuilder dem = new StringBuilder();
        String[] w = this.name.split(" ");
        for(int i = 1;i < w.length-1;i++){
            if(i > 1){
                dem.append(" ");
            }
            dem.append(w[i]);
        }
        return dem.toString();
    }
    @Override
    public int compareTo(DANHSACH o){
        if(this.ten().equals(o.ten())){
            if(this.ho().equals(o.ho())){
                return this.dem().compareTo(o.dem());
            }
            return this.ho().compareTo(o.ho());
        }
        return this.ten().compareTo(o.ten());
    }
    
    @Override
    public String toString(){
        return name;
    }
}
