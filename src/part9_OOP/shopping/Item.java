package part9_OOP.shopping;

public class Item {
    private final String name;
    private final double cost;

    //Constructor
    public Item(String name, double cost){
        this.name = name;
        this.cost = cost;
    }

    //Getter
    public double getCost(){
        return this.cost;
    }
    public String getName(){
        return this.name;
    }
}
