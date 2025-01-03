package Th5;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException,ClassNotFoundException,FileNotFoundException{
        boolean[] ok = new boolean[1000005];
        for(int i = 2;i < ok.length;i++){
            ok[i] = true;
        }
        for(int i = 2;i <= (int)Math.sqrt(ok.length);i++){
            if(ok[i]){
                for(int j = i; i * j < ok.length; j++){
                    ok[i*j] = false;
                }
            }
        }
        ObjectInputStream x = new ObjectInputStream(new FileInputStream("DAYSO.DAT"));
        ArrayList<Integer> a = (ArrayList<Integer>) x.readObject();
        HashSet<Integer> res = new HashSet<>();
        a.forEach(e-> {
           if(ok[e]){
               if(e > Math.pow(10,2)){
                   res.add(e);
               }
           }
        });
        ArrayList<Integer> v = new ArrayList<>(res);
        Collections.sort(v);
        for(int m : v){
            System.out.println(m);
        }
    }
}
