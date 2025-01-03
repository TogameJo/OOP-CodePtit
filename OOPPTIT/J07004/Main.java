package J07004;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        File x = new File("DATA.in");
        Scanner sc = new Scanner(x);
        ArrayList<Integer> a = new ArrayList<>();
        while(sc.hasNextInt()){
            a.add(sc.nextInt());
        }
        HashMap<Integer,Integer> mp = new HashMap<>();
        HashSet<Integer> v = new HashSet<>(a);
        for(int i = 0;i < a.size();i++){
            if(mp.containsKey(a.get(i))){
                mp.put(a.get(i), mp.get(a.get(i))+1);
            }else{
                mp.put(a.get(i),1);
            }
        }
        ArrayList<Integer> res = new ArrayList<>(v);
        Collections.sort(res);
        for(int i = 0;i < res.size();i++){
            System.out.println(res.get(i) + " " + mp.get(res.get(i)));
        }
    }
}
