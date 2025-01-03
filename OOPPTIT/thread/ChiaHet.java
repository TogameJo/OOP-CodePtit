package thread;
import java.util.*;

public class ChiaHet extends Thread{
    public void run(){
        for(int i = 0;i <= 10000;i++){
            if(i % 9 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
