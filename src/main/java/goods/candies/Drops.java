package goods.candies;

import construction.enums.Packages;

public class Drops {
    //define 2 fields: name, packType
    Packages packType;
    String name;

    //define 1 constructor containing both fields
    public Drops(Packages packType, String name) {
        this.packType = packType;
        this.name = name;
    }

    //define 2 public methods getName, getPackType
    public Packages getPackType() {
        return packType;
    }

    public String getName() {
        return name;
    }
}
