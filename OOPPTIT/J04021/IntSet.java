package J04021;

import java.util.*;

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
    public IntSet union(IntSet o){
        IntSet res = new IntSet();
        res.w.addAll(this.w);
        res.w.addAll(o.w);
        return res;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int x : w) {
            if (sb.length() > 0) sb.append(" ");
            sb.append(x);
        }
        return sb.toString();
    }
}
