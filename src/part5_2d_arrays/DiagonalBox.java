package part5_2d_arrays;

import java.util.Scanner;

//https://www.brianheinold.net/java/java_book.html#sec_varloopifexercises
//8.5.103 create array that resemble to cross box below:
/*
##########
##      ##
# #    # #
#  #  #  #
#   ##   #
#   ##   #
#  #  #  #
# #    # #
##      ##
##########
*/
public class DiagonalBox {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Height of the cross box:");
        int n = scanner.nextInt();
        char[][] crossBox = new char[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                // Draw Box
                if(i==0 || j==0 || i==n-1 || j==n-1){
                    crossBox[i][j] = '#';
                }
                // Draw X-Cross
                else if (i==j || i+j+1==n) {
                    crossBox[i][j] = '#';
                }
            }
        }

        for(char[] row: crossBox){
            System.out.println(String.valueOf(row));
        }
    }
}
