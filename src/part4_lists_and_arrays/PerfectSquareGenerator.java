package part4_lists_and_arrays;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

//https://www.brianheinold.net/java/java_book.html#sec_varloopifexercises
//8.4.74-75-76 array and list out first 100 perfect square
public class PerfectSquareGenerator {
    public static void main(String[] args){
        //array
        int [] perfectSquareArray = new int [100];
        for(int i=1; i<=100; i++){
            perfectSquareArray[i-1] = i*i;
        }
        System.out.println("Array:" + Arrays.toString(perfectSquareArray));

        // List
//      Fail:  List<int> perfectSquareList = new List(); -> Can't use primitive type here & Abstract Class can't be Instantiate
        List<Integer> perfectSquareList = new ArrayList<Integer>();
        for(int i=1; i<=100; i++){
            perfectSquareList.add(i*i);
        }
        System.out.println("List:" + perfectSquareList);
    }
}
