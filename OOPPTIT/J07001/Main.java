package J07001;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args){
        File f = new File("Data.in");
        try{
            Scanner sc = new Scanner(f);
            while(sc.hasNext()){
                System.out.println(sc.nextLine());
            }
            sc.close();
        }catch(FileNotFoundException e){

        }
    }
}
