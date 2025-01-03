package J07014;

import java.io.*;
import java.util.*;

public class WordSet {
    private TreeSet<String> w;
    public WordSet(String file) throws IOException {
        w = new TreeSet<>();
        File x = new File(file);
        Scanner sc = new Scanner(x);
        while (sc.hasNext()) {
            w.add(sc.next().toLowerCase());
        }
    }
    public WordSet() {
        w = new TreeSet<>();
    }
    public WordSet union(WordSet o) throws IOException {
        WordSet res = new WordSet();
        res.w.addAll(this.w);
        res.w.addAll(o.w);
        return res;
    }
    public WordSet intersection(WordSet o) throws IOException {
        WordSet result = new WordSet();
        result.w.addAll(this.w);
        result.w.retainAll(o.w);
        return result;
    }
    @Override
    public String toString() {
        return String.join(" ", w);
    }
}
