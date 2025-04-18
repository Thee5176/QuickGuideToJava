package part1_variables_loops_conditions;
import java.util.Scanner;

//https://www.brianheinold.net/java/java_book.html#sec_varloopifexercises
//8.1.3 Calculate BMI with formula = 703w/h^2
public class BMI {
    public static void main(String[] args){
        System.out.println("Please enter your weight(pounds): ");
        Scanner scanner = new Scanner(System.in);
        double w = scanner.nextDouble();
        System.out.println("Please enter your height(inches):");
        double h = scanner.nextDouble();
        double bmi = (703.0*w)/(h*h) ;
        System.out.println("Your BMI:" + bmi);
    }
}
