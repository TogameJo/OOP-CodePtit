package J07011;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File x = new File("VANBAN.in");
        Scanner sc = new Scanner(x);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<String> a = new ArrayList<>();
        while(t --> 0){
            String s = sc.nextLine();
            String[] d = s.split("[\\s\\-/._!,?:;()]+");
            for(String temp : d){
                a.add(temp.toLowerCase());
            }
        }
        HashMap<String,Integer> mp = new HashMap<>();
        a.forEach(e -> {
            mp.put(e,mp.getOrDefault(e,0)+1);
        });
        List<Map.Entry<String,Integer>> list = new ArrayList<>(mp.entrySet());
        list.sort((e1,e2) ->{
            int cmp = Integer.compare(e2.getValue(), e1.getValue());
            if (cmp == 0) {
                return e1.getKey().compareTo(e2.getKey());
            }
            return cmp;
        });
        for(Map.Entry<String,Integer> entry : list){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
