package part1_variables_loops_conditions;

import java.util.Scanner;

public class TrianglePrinter {
    public static void main(String[] args){
    int height = new Scanner(System.in).nextInt();
    String s = "*";

    for (int i=0; i<height; i++){
        System.out.println(s);
        s += "*";
    }
}
}
