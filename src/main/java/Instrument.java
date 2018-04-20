public abstract class Instrument {

    String name;
    String type;
    double price;


    public void Intrument(String name, String type, int price){
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
