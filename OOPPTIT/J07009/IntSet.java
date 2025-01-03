package J07009;

import java.util.*;
import java.io.*;

public class IntSet {
    private TreeSet<Integer> w;
    public IntSet(int[] a){
        w = new TreeSet<>();
        for(int i : a){
            w.add(i);
        }
    }
    public IntSet(){
        w = new TreeSet<>();
    }
    public IntSet intersection(IntSet o){
        IntSet res = new IntSet();
        res.w.addAll(this.w);
        res.w.retainAll(o.w);
        return res;
    }
    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        for(int x : w){
            if(res.length() > 0){
                res.append(" ");
            }
            res.append(x);
        }
        return res.toString();
    }
}
