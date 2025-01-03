package J07031;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        boolean[] ok = new boolean[1000005];
        Arrays.fill(ok,true);
        ok[0] = ok[1] = false;
        for(int i = 2;i*i < ok.length;i++) {
            if (ok[i]) {
                for (int j = i * i; j < ok.length; j += i) {
                    ok[j] = false;
                }
            }
        }
        ObjectInputStream x1 = new ObjectInputStream(new FileInputStream("DATA1"));
        ArrayList<Integer> newm1 = (ArrayList<Integer>) x1.readObject();
        ObjectInputStream x2 = new ObjectInputStream(new FileInputStream("DATA2"));
        ArrayList<Integer> newm2 = (ArrayList<Integer>) x2.readObject();
        x1.close();
        x2.close();

        TreeSet<Integer> res = new TreeSet<>(newm1);

        final int sum = 1000000;
        for(int n : res){
            if(n < sum/2){
                int m = sum - n;
                if(n < m && ok[n] && ok[m] && newm1.contains(m) && !newm2.contains(n) && !newm2.contains(m)){
                    System.out.println(n + " " + m);
                }
            }
        }
    }
}
