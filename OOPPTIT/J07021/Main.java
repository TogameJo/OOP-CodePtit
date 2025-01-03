package J07021;
import java.util.*;
import java.io.*;

public class Main {
    public static String chuanhoa(String s){
        s = s.toLowerCase();
        StringTokenizer tk = new StringTokenizer(s);
        ArrayList<String> v = new ArrayList<>();
        while(tk.hasMoreTokens()){
            v.add(tk.nextToken());
        }
        StringBuilder res = new StringBuilder();
        for(int i = 0;i < v.size();i++){
            if(i >= 1){
                res.append(" ");
            }
            String ans = v.get(i);
            res.append(Character.toUpperCase(ans.charAt(0)));
            res.append(ans.substring(1));
        }
        return res.toString();
    }
    public static void main(String[] args) throws FileNotFoundException{
        File x = new File("C:\\Users\\Lenovo\\Documents\\Ptit code\\OOP PTIT\\OOPPTIT\\J07021\\DATA.in");
        Scanner sc = new Scanner(x);
        while(sc.hasNextLine()){
            String name = sc.nextLine();
            if(name.equals(" ")){
                continue; //nếu gawpj một dòng k co ki tu se  bo qua va chuyen sang dong tiep theo
            }
            if(name.equals("END")){
                break;
            }
            System.out.println(chuanhoa(name));
        }
        sc.close();
    }
}
