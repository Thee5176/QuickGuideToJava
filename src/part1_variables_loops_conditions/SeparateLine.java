package part1_variables_loops_conditions;

//https://www.brianheinold.net/java/java_book.html#sec_varloopifexercises
//8.1.10 Construct only print file number ending with 8
public class SeparateLine {
    public static void main(String[] args){
        for(int i = 1; i<1000; i++) {
            if (i % 10 ==8){
                System.out.println("file" + i + ".jpg, ");
            }
        }
    }
}
