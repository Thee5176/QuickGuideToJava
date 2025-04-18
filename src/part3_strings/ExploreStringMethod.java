package part3_strings;

//https://www.brianheinold.net/java/java_book.html#sec_varloopifexercises
//8.2.38 lowercase, length, locate letter, select firs/last 3 letters
public class ExploreStringMethod {
    public static void main(String[] args){
        String word = "ZucChINI";

        // lowercase
        String wordLower = word.toLowerCase();
        System.out.println(wordLower);
        // length
        int len = word.length();
        System.out.println(len);
        // locate letter
        System.out.println(word.indexOf("z")); //This will not found(:-1) -> Case sensitive
        System.out.println(word.indexOf("h"));
        // First 3 letter
        System.out.println(word.substring(0,3));
        // Last 3 letter
        System.out.println(word.substring(len-3));
    }
}
