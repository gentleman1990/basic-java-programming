import java.math.BigDecimal;
import java.math.BigInteger;

public class Airplane {

    private byte numberOfWheel; // 8bit | range: -128 to 127
    private short numberOfWings; // 16bit | range: -32,768 to 32,767
    private int weight; // 32bit | range: -2^31 to 2^31 - 1
    private long  range; //64bit | range: -2^63 to 2^63 - 1
    private float height; //32bit | single-precision, 754 floating point
    private double width; //64bit | double-precision, 754 floating point
    private char model; // single 16-bit Unicode character
    private boolean isInUse; // only true or false

    private String name;
    private BigInteger bigInteger; // sky is the limit - for mathematical purposes
    private BigDecimal bigDecimal; // sky is the limit - for mathematical purposes


    public Airplane() {
    }

    public Airplane(byte numberOfWheel, short numberOfWings, int weight, long range, float height, double width, char model, boolean isInUse, String name, BigInteger bigInteger, BigDecimal bigDecimal) {
        this.numberOfWheel = numberOfWheel;
        this.numberOfWings = numberOfWings;
        this.weight = weight;
        this.range = range;
        this.height = height;
        this.width = width;
        this.model = model;
        this.isInUse = isInUse;
        this.name = name;
        this.bigInteger = bigInteger;
        this.bigDecimal = bigDecimal;
    }

    public Airplane(byte numberOfWheel, short numberOfWings, int weight, long range, float height, double width, char model, boolean isInUse, String name) {
        this.numberOfWheel = numberOfWheel;
        this.numberOfWings = numberOfWings;
        this.weight = weight;
        this.range = range;
        this.height = height;
        this.width = width;
        this.model = model;
        this.isInUse = isInUse;
        this.name = name;
    }

    public byte getNumberOfWheel() {
        return numberOfWheel;
    }

    public void setNumberOfWheel(byte numberOfWheel) {
        this.numberOfWheel = numberOfWheel;
    }

    public short getNumberOfWings() {
        return numberOfWings;
    }

    public void setNumberOfWings(short numberOfWings) {
        this.numberOfWings = numberOfWings;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public long getRange() {
        return range;
    }

    public void setRange(long range) {
        this.range = range;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public char getModel() {
        return model;
    }

    public void setModel(char model) {
        this.model = model;
    }

    public boolean isInUse() {
        return isInUse;
    }

    public void setInUse(boolean inUse) {
        isInUse = inUse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
