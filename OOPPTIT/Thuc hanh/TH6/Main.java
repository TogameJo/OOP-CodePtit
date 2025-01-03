package TH6;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        File x = new File("DANHSACH.in");
        Scanner sc = new Scanner(x);
        ArrayList<String> name = new ArrayList<>();
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            s = s.toLowerCase();
            StringTokenizer tk = new StringTokenizer(s);
            StringBuilder temp = new StringBuilder();
            while(tk.hasMoreTokens()){
                temp.append(tk.nextToken() + " ");
            }
            name.add(temp.toString());
        }
        LinkedHashSet<String> set = new LinkedHashSet<>();
        for(int i = 0;i < name.size();i++){
            set.add(name.get(i));
        }
        ArrayList<String> name2 = new ArrayList<>();
        HashMap<String,Integer> mp = new HashMap<>();
        ArrayList<String> kq = new ArrayList<>();
        for (String temp : set) {
            String[] w = temp.split(" ");
            int n = w.length;
            StringBuilder res = new StringBuilder();
            if (n > 1) {
                res.append(w[n - 1]);
            }
            for (int i = 0; i < n - 1; i++) {
                res.append(w[i].charAt(0));
            }
            String baseUsername = res.toString();
            if (mp.containsKey(baseUsername)) {
                int cnt = mp.get(baseUsername);
                cnt++;
                mp.put(baseUsername, cnt);
                res.append(cnt);
            } else {
                mp.put(baseUsername, 1);
            }
            kq.add(res.toString());
        }
        for (String username : kq) {
            System.out.println(username + "@ptit.edu.vn");
        }
    }
}
