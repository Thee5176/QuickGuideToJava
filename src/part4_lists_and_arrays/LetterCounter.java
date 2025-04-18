package part4_lists_and_arrays;

import java.util.Arrays;
import java.util.Scanner;

//https://www.brianheinold.net/java/java_book.html#sec_varloopifexercises
//8.4.9 check what letters are there in the text and count each out
public class LetterCounter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        System.out.println("Enter Word/Sentence: ");
        String myText = scanner.nextLine();

        // Count each letter and create a list of separated character
        int len = myText.length();

        int [] countChar = new int[26];
        for(int i=0; i<len; i++){                       // Refactor Using Scanner(String): https://www.brianheinold.net/java/java_book.html#sec_scanners
            char mychar = myText.charAt(i);
            // indexing mychar from alphabet to get index
            int index = alphabet.indexOf(mychar);
            // increment count to countChar
            countChar[index]++;
        }

        System.out.println(Arrays.toString(countChar));
    }
}
