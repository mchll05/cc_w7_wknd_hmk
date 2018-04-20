public abstract class Instrument {

    String name;
    String type;
    double price;


    public Instrument(String name, String type, double price){
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }

    public double getPrice(){
        return price;
    }
}
