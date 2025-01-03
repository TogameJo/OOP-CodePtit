package J07016;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        boolean[] ok = new boolean[1000005];
        Arrays.fill(ok,true);
        ok[0] = ok[1] = false;
        for(int i = 2; i*i < ok.length;i++){
            if(ok[i]){
                for(int j = i*i;j < ok.length;j+=i){
                    ok[j] = false;
                }
            }
        }
        ObjectInputStream x1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> h1 = (ArrayList<Integer>) x1.readObject();
        ObjectInputStream x2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> h2 = (ArrayList<Integer>) x2.readObject();
        TreeMap<Integer,Integer> mp1 = new TreeMap<>();
        TreeMap<Integer,Integer> mp2 = new TreeMap<>();
        h1.forEach(e -> {
            if(ok[e]){
                if(mp1.get(e) == null) mp1.put(e, 1);
                else mp1.put(e, mp1.get(e)+1);
            }
        });
        h2.forEach(e -> {
            if(ok[e]){
                if(mp2.get(e) == null) mp2.put(e, 1);
                else mp2.put(e, mp2.get(e)+1);
            }
        });
        mp1.forEach((k,v) -> {
            if(mp2.get(k) != null){
                System.out.println(k + " " + v + " " + mp2.get(k));
            }
        });
    }
}
