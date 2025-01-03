package J05032;

import java.util.*;
import java.text.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<Tuoi> a = new ArrayList<>();
        while(t-->0){
            String[] temp = sc.nextLine().split("\\s+");
            String name = temp[0];
            String tuoi = temp[1];
            a.add(new Tuoi(name,tuoi));
        }
        Collections.sort(a);
        System.out.println(a.get(a.size()-1).getName());
        System.out.println(a.get(0).getName());
    }
}
/*
5
Nam 01/10/1991
An 30/12/1990
Binh 15/08/1993
Tam 18/09/1990
Truong 20/09/1990
 */