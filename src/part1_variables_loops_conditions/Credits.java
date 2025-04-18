package part1_variables_loops_conditions;
import java.util.Scanner;

//https://www.brianheinold.net/java/java_book.html#sec_varloopifexercises
//8.1.4 Find University class standing by credit counts
public class Credits {
    public static void main(String[] args){
        System.out.println("Enter your current credit counts:");
        Scanner scanner = new Scanner(System.in);
        int credit = scanner.nextInt();
        if (credit < 24){
            System.out.println("Freshmen");
        } else if (credit < 54) {
            System.out.println("Sophomores");
        } else if (credit < 84) {
            System.out.println("Juniors");
        } else {
            System.out.println("Seniors");
        }
    }
}
