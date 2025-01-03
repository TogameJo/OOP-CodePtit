package J07024;

import java.util.*;
import java.io.*;

public class WordSet {
    private TreeSet<String> w;
    public WordSet(String file) throws IOException{
        w = new TreeSet<>();
        File x = new File(file);
        Scanner sc = new Scanner(x);
        while(sc.hasNext()){
            w.add(sc.next().toLowerCase());
        }
    }
    public WordSet(){
        w = new TreeSet<>();
    }
    public WordSet difference(WordSet o)throws IOException{
        WordSet result = new WordSet();
        for (String word : this.w) {
            if (!o.w.contains(word)) {
                result.w.add(word);
            }
        }
        return result;
    }
    @Override
    public String toString(){
        return String.join(" ",w);
    }
}
