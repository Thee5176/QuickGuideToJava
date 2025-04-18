package part1_variables_loops_conditions;

import java.util.Scanner;

//https://www.brianheinold.net/java/java_book.html#sec_varloopifexercises
//8.1.8 Goods charge $12/item for less than 10 items , $10 from 10 - 99, $7 for 100 items and over
public class GoodsCharge {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int charge;

        System.out.println("How many items to buy?");
        int amount = scanner.nextInt();

        if(amount < 10){
            charge = amount * 12;
        } else if(amount < 100){
            charge = amount * 10;
        } else {
            charge = amount * 7;
        }

        System.out.println("Total Cost: $" + charge);
    }
}
