package part3_strings;

import java.util.Scanner;
//https://www.brianheinold.net/java/java_book.html#sec_varloopifexercises
//8.3.64 check palindrome word
public class PalindromeChecker {
    public static void main(String[] args){
        System.out.println("Enter word: ");
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        // Accept input
        String word = scanner.nextLine();

        // Create reverse string
        String reverse = "";
        for(int i=word.length()-1; i>=0 ; i--){
            sb.append(word.charAt(i)); //StringBuilder: https://www.brianheinold.net/java/java_book.html#sec_stringbuilder
            reverse = sb.toString();
        }

        if(word.equals(reverse)){
            System.out.printf("%s is a palindrome word \n", word);
        } else {
            System.out.printf("Not Palindrome: %s != %s \n", word, reverse);
        }
    }
}
