package J07006;

import java.util.*;
import java.io.*;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) throws IOException,ClassNotFoundException,FileNotFoundException{
        ObjectInputStream x = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> res = (ArrayList<Integer>) x.readObject();
        TreeMap<Integer,Integer> mp = new TreeMap<>();
        res.forEach(a -> {
            if(mp.get(a) == null){
                mp.put(a,1);
            }else{
                mp.put(a,mp.get(a)+1);
            }
        });
        for(int i = 0;i < res.size();i++){
            System.out.println(res.get(i) + " " + mp.get(res.get(i)));
        }
    }
}
