package part3_strings;

//https://www.brianheinold.net/java/java_book.html#sec_varloopifexercises
/*8.3.70 Write a program that uses a loop to generate the 26-line block of letters

abcdefghijklmnopqrstuvwxyz
bcdefghijklmnopqrstuvwxyza
cdefghijklmnopqrstuvwxyzab
...
yzabcdefghijklmnopqrstuvwx
zabcdefghijklmnopqrstuvwxy
 */

public class AlphabetLoopPrinter {
    public static void main(String[] args){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        // i starting position
        for(int i=0; i<alphabet.length(); i++){
            String output = "";
            for(int j=0; j<alphabet.length(); j++){
                int index = (i+j)%26;
                output += alphabet.charAt(index);
            }
            System.out.println(output);
        }
    }
}
