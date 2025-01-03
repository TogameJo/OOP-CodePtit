package J02017;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Stack<Integer> a = new Stack<>();
        for(int i = 0;i < t;i++){
            int x = sc.nextInt();
            if(a.isEmpty()){
                a.push(x);
            }else{
                if((a.lastElement()+x) % 2 == 0){
                    a.pop();
                }else{
                    a.push(x);
                }
            }
        }
        System.out.print(a.size());
        sc.close();
    }
}
