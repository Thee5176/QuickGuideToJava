package part1_variables_loops_conditions;

import java.util.Scanner;

//https://www.brianheinold.net/java/java_book.html#sec_varloopifexercises
//8.1.8 Charge user $5.5 per 1 hour usage
public class UsageBilling {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double charge;

        System.out.println("Enter start time:");
        int startTime = scanner.nextInt();
        System.out.println("Enter end time:");
        int endTime = scanner.nextInt();

        if (startTime >= endTime) {
            charge = ((24 - startTime) + endTime) * 5.5;
        } else {
            charge = (endTime - startTime) * 5.5;
        }
        System.out.println("Your charge: $" + charge);
    }
}
