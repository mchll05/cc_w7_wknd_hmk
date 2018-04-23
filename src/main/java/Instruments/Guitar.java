package Instruments;

public class Guitar extends Instrument {

    int stringNum;

    public Guitar(String name, String type, double price, int stringNum) {
        super(name, type, price);
        this.stringNum = stringNum;

    }

    public int getStringNum() {
        return stringNum;
    }
}
