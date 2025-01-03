package J07007;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        File x = new File("VANBAN.in");
        Scanner sc = new Scanner(x);
        HashSet<String> a = new HashSet<>();
        while(sc.hasNext()){
            a.add(sc.next().toLowerCase());
        }
        ArrayList<String> v = new ArrayList<>();
        for(String i : a){
            v.add(i);
        }
        Collections.sort(v);
        for(String res : v){
            System.out.println(res);
        }
    }
}
