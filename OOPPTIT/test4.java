import java.util.*;
public class test4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> mp = new HashMap<>();
        while(true){
            int x = sc.nextInt();
            if(mp.containsKey(x)){
                mp.put(x,mp.get(x) + 1);
            }else {
                mp.put(x, 0);
            }
        }
    }
}
//123 321 23456 123 123 23456 3523 123 321 4567 8988 78 7654 9899 3456 123 678 999 78 3456 987654321 4546 63543 4656 13432 4563 123471 659837 454945 34355 9087 9977 98534 3456 23134
