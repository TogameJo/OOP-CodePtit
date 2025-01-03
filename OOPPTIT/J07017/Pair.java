package J07017;

public class Pair<K,V> {
    private K a;
    private V b;
    public Pair(K a,V b){
        this.a = a;
        this.b = b;
    }
    public boolean isPrime(){
        return prime((Integer) a) && prime((Integer) b);
    }
    public static boolean prime(Integer x) {
        if (x < 2) return false;
        for(int i = 2;i*i <= x;i++){
            if(x % i == 0){
                return false;
            }
        }
        return true;
    }
    public String toString(){
        return a.toString()+" "+b.toString();
    }
}
