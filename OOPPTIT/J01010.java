import java.util.*;

public class J01010 {
    public static String cut(String num){
        StringBuilder res = new StringBuilder();//khoi tao mot chuoi
        for(char c : num.toCharArray()){//duyet cac ki tu torng chuoi
            switch(c){
                case '0':
                    res.append("0");
                    break;
                case '1':
                    res.append("1");
                    break;
                case '8':
                    res.append("0");
                    break;
                case '9':
                    res.append("0");
                    break;
                default:
                    return "INVALID";
            }
        }
        String finalres = res.toString().replaceFirst("^0+", ""); //xoa so 0 o dau tien
        if(finalres.isEmpty()){
            return "INVALID";
        }
        return finalres;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
           String num = sc.nextLine();
           System.out.println(cut(num));
        }
    }
}
