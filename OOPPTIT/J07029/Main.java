package J07029;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        boolean[] check = new boolean[100005];
        for(int i = 2;i <= check.length;i++){
            check[i] = true;
        }
        for(int i = 2;i <= (int)Math.sqrt(check.length);i++){
            if(check[i]){
                for(int j = i;j <= 1000005/i;j++){
                    check[i*j] = false;
                }
            }
        }
        ObjectInputStream x = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> v = (ArrayList<Integer>) x.readObject();
        TreeMap<Integer,Integer> a = new TreeMap<>();
        v.forEach(e ->{
            if(check[e]){
                if(a.get(e) == null){
                    a.put(e,1);
                }else{
                    a.put(e,a.get(e)+1);
                }
            }
        });
        for(int i = 0;i < 10;i++){
            a.forEach((k,l) ->{
                System.out.println(k + " " + l);
            });
        }
    }
}
