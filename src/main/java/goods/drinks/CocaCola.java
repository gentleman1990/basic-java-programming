package goods.drinks;

public class CocaCola {
    //define 3 fields: name, volume, quantityInPack
    String name;
    double volume;
    int quantityInPack;

    //define 2 additional constructors containing name and volume and name, volume, quantityInPack

    public CocaCola(String name, double volume) {
        this.name = name;
        this.volume = volume;
    }

    public CocaCola(String name, double volume, int quantityInPack) {
        this.name = name;
        this.volume = volume;
        this.quantityInPack = quantityInPack;
    }

    //define 3 public methods getName, getVolume, getQuantityInPack

    public String getName() {
        return name;
    }

    public double getVolume() {
        return volume;
    }

    public int getQuantityInPack() {
        return quantityInPack;
    }

    //define 1 private method setting quantityInPack value

    public void setQuantityInPack(int quantityInPack) {
        this.quantityInPack = quantityInPack;
    }
}
