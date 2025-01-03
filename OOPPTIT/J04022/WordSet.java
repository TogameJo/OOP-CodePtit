package J04022;

import java.util.*;

public class WordSet {
    private TreeSet<String> w;
    public WordSet(String s){
        w = new TreeSet<>();
        Scanner sc = new Scanner(s);
        while(sc.hasNext()){
            w.add(sc.next().toLowerCase());
        }
    }
    public WordSet(){
        w = new TreeSet<>();
    }
    public WordSet union(WordSet o){
        WordSet res = new WordSet();
        res.w.addAll(this.w);
        res.w.addAll(o.w);
        return res;
    }
    public WordSet intersection(WordSet o){
        WordSet res = new WordSet();
        res.w.addAll(this.w);
        res.w.retainAll(o.w);
        return res;
    }
    @Override
    public String toString() {
        return String.join(" ", w);
    }
}
