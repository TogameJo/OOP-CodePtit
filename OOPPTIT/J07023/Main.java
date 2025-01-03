package J07023;

import java.util.*;
import java.io.*;

public class Main {
    public static boolean check(int i){
        String s = Integer.toString(i);
        for(int j = 0;j < s.length()/2;j++){
            if(s.charAt(0) != s.charAt(s.length()-j-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        boolean[] ok = new boolean[1000005];
        Arrays.fill(ok,true);
        ok[0] = ok[1] = false;
        for(int i = 2;i*i < ok.length;i++){
            if(ok[i]){
                for(int j = i*i;j<ok.length;j+=i){
                    ok[j] = false;
                }
            }
        }

        ObjectInputStream x1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> a1 = (ArrayList<Integer>) x1.readObject();
        ObjectInputStream x2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a2 = (ArrayList<Integer>) x2.readObject();
        TreeMap<Integer,Integer> mp1 = new TreeMap<>();
        TreeMap<Integer,Integer> mp2 = new TreeMap<>();
        a1.forEach(e -> {
           if(ok[e] && check(e)){
               mp1.put(e,mp1.getOrDefault(e,0)+1);
           }
        });
        a2.forEach(e -> {
            if(ok[e] && check(e)){
                mp2.put(e,mp2.getOrDefault(e,0)+1);
            }
        });
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : mp1.entrySet()) {
            int k = entry.getKey();
            int v1 = entry.getValue();
            if (mp2.containsKey(k)) {
                System.out.println(k + " " + v1 + " " + mp2.get(k));
                count++;
                if (count == 10) {
                    break;
                }
            }
        }
    }
}
