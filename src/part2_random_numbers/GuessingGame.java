package part2_random_numbers;

import java.util.Random;
import java.util.Scanner;

//https://www.brianheinold.net/java/java_book.html#sec_varloopifexercises
//8.2.35 Guess number 1-10: correct gain 100 point: wrong lose 20 point
public class GuessingGame {
    static int point = 100; // Dont forget "static" keyword
    static int correct = 0;
    static int wrong = 0;
    public static void main(String[] args){
        while(true){
            if(point >= 200){
                System.out.println("You won");
                break;
            } else if (point < 0) {
                System.out.println("You Lose");
                break;
            } else {
                start_guessing();
            }
        }
        System.out.printf("You have guessed %d rights and %d wrongs",correct, wrong);
    }

    private static void start_guessing() {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int answer = rand.nextInt(10)+1;

        System.out.println("Guess number from 1-10: ");
        int guess = scanner.nextInt();

        if(guess == answer){
            System.out.println("You are Right!.");
            point += 100;
            correct++;
        } else {
            System.out.printf("You are Wrong. The number is %d. \n",answer);
            point -= 20;
            wrong++;
        }
        System.out.printf("Current Score: %d \n", point);
    }
}
