package J05033;

public class Time implements Comparable<Time>{
    private int h,m,s;
    public Time(int h,int m,int s){
        this.h = h;
        this.m = m;
        this.s = s;
    }

    @Override
    public int compareTo(Time o) {
        if (this.h != o.h) {
            return Integer.compare(this.h, o.h);
        } else if (this.m != o.m) {
            return Integer.compare(this.m, o.m);
        }else{
            return Integer.compare(this.s ,o.s);
        }
    }

    @Override
    public String toString(){
        return h + " " + m + " " + s;
    }
}
