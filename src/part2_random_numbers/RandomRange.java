package part2_random_numbers;
import java.util.Random;

//https://www.brianheinold.net/java/java_book.html#sec_varloopifexercises
//8.2.32 100 random numbers : 1st num -> range 1-2, 2nd -> range 1-3...100th -> range 1-100
public class RandomRange {
    public static void main(String[] args){
        Random rand = new Random();

        for(int i=2; i<=100; i++){
            int num = rand.nextInt(1,i);
            System.out.print(i + " ");
            System.out.println(num);
        }
    }
}
