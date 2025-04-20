package part5_2d_arrays;

import java.util.Arrays;
import java.util.Scanner;

//https://www.brianheinold.net/java/java_book.html#sec_varloopifexercises
//8.5.101 print n x n array of checkerboard pattern with 0,1
public class CheckboardCreator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Checkerboard height: ");
        int n = scanner.nextInt();
        int [][] checkerboard = new int[n][n];

        // create checkerboard array
        for(int i=0; i<n; i++){
            for(int j=0;j<n;j++){
                checkerboard[i][j] = (i+j)%2;
            }
        }

        // print checkerboard array
        for(int row=0; row<checkerboard.length; row++){
            System.out.println(Arrays.toString(checkerboard[row]));
        }
    }
}
