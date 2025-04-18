package part1_variables_loops_conditions;
import java.util.Scanner;

//https://www.brianheinold.net/java/java_book.html#sec_varloopifexercises
//8.1.7 Find average of 10 inputs number
public class InputAverage {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i < 10+1; i++){
            System.out.println("Please enter your #" + i + " number.");
            sum += scanner.nextInt();
        }
        double average = sum / 10.0;
        System.out.println("Average: " + average);
    }
}
