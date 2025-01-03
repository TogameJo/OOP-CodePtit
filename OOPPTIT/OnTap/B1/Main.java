package B1;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<>();
        while(sc.hasNext()){
            a.add(sc.next());
        }
        int max = a.get(0).length();
        String res = a.get(0);
        for(String i : a){
            if(i.length() > max){
                max = i.length();
                res = i;
            }
        }
        System.out.println(res + " - " + max);
    }
}
