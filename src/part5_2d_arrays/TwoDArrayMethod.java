package part5_2d_arrays;

import java.util.Arrays;
import java.util.Random;

//https://www.brianheinold.net/java/java_book.html#sec_varloopifexercises
//8.5.96 explore basis 2d array manipulation
public class TwoDArrayMethod {
    public static void main(String[] args){
        Random rand = new Random();
        int len = 6;
        int[][] myArray = new int[len][len];

        //Create random 6x6 arrays
        for(int i=0; i<len; i++) {
            for(int j=0; j<len; j++) {
                myArray[i][j] = rand.nextInt(9); // 0-8
            }
        }

        // Print out the array.
        System.out.println(Arrays.deepToString(myArray));

        // Add up all the entries in the last column
        int total = 0;
        for(int[] row: myArray){
            total += row[len-1];
        }
        System.out.println(total);

        // Convert to One-dimensional array
        int[] newArray = new int[len*len];
        int j = 0;
        for(int i = 0;i<len;i++)
        {

            for(int item: myArray[i])
            {
                newArray[j] = item;
                j++;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
