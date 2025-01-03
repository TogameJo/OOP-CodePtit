package J05042;

public class Submit implements Comparable<Submit>{
    private String name;
    private int ac,sub;

    public Submit(String name, int ac, int sub) {
        this.name = name;
        this.ac = ac;
        this.sub = sub;
    }


    @Override
    public int compareTo(Submit o) {
        if(this.ac == o.ac){
            if(this.sub == o.sub){
                return this.name.compareTo(o.name);
            }
            return Integer.compare(this.sub,o.sub);
        }
        return Integer.compare(o.ac,this.ac);
    }
    @Override
    public String toString(){
        return name + " " + ac + " " + sub;
    }
}
