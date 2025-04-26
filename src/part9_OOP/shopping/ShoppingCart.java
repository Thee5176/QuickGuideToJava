package part9_OOP.shopping;

import java.util.ArrayList;
import java.util.List;

//https://www.brianheinold.net/java/java_book.html#sec_varloopifexercises
//8.9.177 Shopping Cart Logic
public class ShoppingCart {
    private List<Item> items = new ArrayList<Item>();

    public ShoppingCart(){}

    public void add(String name, double price){
        Item newItem = new Item(name, price);
        items.add(newItem);
    }

    public double total(){
        double total = 0d;
        for(Item item : this.items){
            total += item.getCost();
        }
        return total;
    }

    public void removeItems(String name){
//        List<Item> toRemove = new ArrayList<>();
//        for( Item item: items ){
//            if ( item.getName().equals(name) ){
//                toRemove.add(item);
//                System.out.println("removed item:" + item.getName());
//            }
//        }
//        items.removeAll(toRemove);
        // DeepSeek: removeIf + lamda
        items.removeIf(item -> item.getName().equals(name));
    }

    @Override
    public String toString(){
        List<String> strItem = new ArrayList<>();

        for(Item item: items){
            strItem.add(item.getName());
        }

        return strItem.toString();
    }

    public static void main(String[] args){
        ShoppingCart myCart = new ShoppingCart();
        String[] itemName = {"じゃがいも","トマト","白菜","にんにく"};
        int[] itemCost = {249, 300, 196, 480};

        for (int i=0; i<itemName.length;i++){
            myCart.add(itemName[i], itemCost[i]);
        }

        System.out.println(myCart.total());

        myCart.removeItems("トマト");

        System.out.println(myCart);

    }
}
