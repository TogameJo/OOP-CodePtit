package J06007;

public class GiangVien {
    private String id,name;
    public GiangVien(String id,String name){
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return name;
    }
}
