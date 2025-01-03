package TH3;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        File x = new File("DATA.in");
        Scanner sc = new Scanner(x);
        ArrayList<Long> a = new ArrayList<>();
        while(sc.hasNext()){
            try{
                long n = Long.parseLong(sc.next());
                if(n > Math.pow(10,9) && n < Math.pow(10,18)){
                    a.add(n);
                }
            }catch(NumberFormatException e){

            }
        }
        long sum = 0;
        for(long g : a){
            sum += g;
        }
        System.out.println(sum);
    }
}
