import java.util.*;

public class J03009 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            HashMap<String,Boolean> mp = new HashMap<>();
            String a = sc.nextLine();
            String b = sc.nextLine();
            StringTokenizer st1 = new StringTokenizer(a);
            StringTokenizer st2 = new StringTokenizer(b);
            ArrayList<String> list1 = new ArrayList<>();
            ArrayList<String> list2 = new ArrayList<>();
            while(st1.hasMoreTokens()){
                list1.add(st1.nextToken());
            }
            while(st2.hasMoreTokens()){
                list2.add(st2.nextToken());
            }
            for(int i=0;i<list2.size();i++){
                mp.put(list2.get(i),true);
            }
            ArrayList<String> res = new ArrayList<>();
            for(int i=0;i<list1.size();i++){
                if(!mp.containsKey(list1.get(i))){
                    res.add(list1.get(i));
                }
            }
            Collections.sort(res);// sap xep mang dong
            HashSet<String> set = new HashSet<>(); //giong hamset trong c++ chi lay 1 ki tu duy nhat
            for(String str:res){
                set.add(str);
            }
            for(String str1:set){
                System.out.print(str1 + " ");
            }
            System.out.println();
        }
    }
}
