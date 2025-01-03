package B6;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t --> 0){
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine().toLowerCase();
            StringTokenizer tk = new StringTokenizer(s);
            ArrayList<String> w = new ArrayList<>();
            while(tk.hasMoreTokens()){
                w.add(tk.nextToken());
            }
            StringBuilder res = new StringBuilder();
            if(n == 1){
                res.append(Character.toUpperCase(w.get(w.size()-1).charAt(0)));
                res.append(w.get(w.size()-1).substring(1));
                res.append(" ");
                for(int i = 0;i < w.size()-1;i++){
                    if(i >= 1) {
                        res.append(" ");
                    }
                    res.append(Character.toUpperCase(w.get(i).charAt(0)));
                    res.append(w.get(i).substring(1));
                }
            }else if(n == 2){
                for(int i = 1;i < w.size();i++){
                    if(i > 1) {
                        res.append(" ");
                    }
                    res.append(Character.toUpperCase(w.get(i).charAt(0)));
                    res.append(w.get(i).substring(1));
                }
                res.append(" ");
                res.append(Character.toUpperCase(w.get(0).charAt(0)));
                res.append(w.get(0).substring(1));
            }
            System.out.println(res.toString());
        }
    }
}
/*
2
1
NguyeN    vAn    Nam
2
hoAng  le Nhat THONG chi
 */