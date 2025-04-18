package part1_variables_loops_conditions;

import java.util.Scanner;

//https://www.brianheinold.net/java/java_book.html#sec_varloopifexercises
//8.1.5 Calculate electric power with formula P=V^2/R
public class Watt {
    public static void main(String[] args){
        System.out.println("Current Voltage: ");
        Scanner scanner = new Scanner(System.in);
        double v = scanner.nextDouble();
        System.out.println("Resistance:");
        double r = scanner.nextDouble();
        double power = v*v/r ;

        if (power > 1000){
            System.out.println("High Electrical Power Warning!");
        }
        System.out.println("Current has power of " + power + "Watt.");
    }
}
