package part4_lists_and_arrays;

import java.util.Arrays;
import java.util.Random;

// https://www.brianheinold.net/java/java_book.html#sec_varloopifexercises
//8.4.77 generate random array sets of 50 numbers and rotate them once
public class RandomArrayRotator {
    public static void main(String[] args){
        Random rand = new Random();
        int [] intArray= new int[50];

        for(int i=0; i<50; i++){
            intArray[i] = rand.nextInt(1,100);
        }

        // shift 1 position ahead
        int [] shiftedArray = new int[50];
        for(int i=0; i<intArray.length; i++){
            int index = i % 49;
//            0 -> 1 , 48 -> 49, 49 -> 0
            shiftedArray[i] = intArray[index+1];
        }
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(shiftedArray));
    }
}
