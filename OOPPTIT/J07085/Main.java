package J07085;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream x = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> a = (ArrayList<String>) x.readObject();
//        File x = new File("C:\\Users\\Lenovo\\Documents\\Ptitcode\\OOP PTIT\\OOPPTIT\\J07085\\DATA.in");
//        Scanner sc = new Scanner(x);
//        ArrayList<String> a = new ArrayList<>();
//        while(sc.hasNextLine()){
//            a.add(sc.nextLine());
//        }
        ArrayList<Integer> v = new ArrayList<>();
        a.forEach(e ->{
            String[] s = e.split("[a-zA-Z]+");
            String res = "";
            for(String i : s){
                res += i;
            }
            res = res.replaceFirst("^0+","");
            if(res.isEmpty())
            {
                res = "0";
            }
            int sum = 0;
            for(int i = 0;i < res.length();i++){
                sum += (int)(res.charAt(i)-'0');
            }
            System.out.println(res + " " + sum);
        });
    }
}
