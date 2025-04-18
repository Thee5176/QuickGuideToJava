package part1_variables_loops_conditions;

//https://www.brianheinold.net/java/java_book.html#sec_varloopifexercises
//8.1.6 print sequence number as 8,11,14,...,89
public class LoopNumber {
    public static void main(String[] args){
        for(int n = 8; n < 90; n += 3){
            System.out.print(n + ", ");
        }
    }
}
