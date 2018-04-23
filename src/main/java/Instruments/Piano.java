package Instruments;

import Instruments.Instrument;

public class Piano extends Instrument {

    String size;

    public Piano(String name, String type, double price, String size) {
        super(name, type, price);
        this.size = size;
    }

    public String getSize(){
        return size;
    }
}
