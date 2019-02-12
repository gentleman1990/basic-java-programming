package goods.candies;

public class Drops {
    //define 2 fields: name, packType
    String packType;
    String name;

    //define 1 constructor containing both fields
    public Drops(String packType, String name) {
        this.packType = packType;
        this.name = name;
    }

    //define 2 public methods getName, getPackType
    public String getPackType() {
        return packType;
    }

    public String getName() {
        return name;
    }
}
