package part8_function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class part8_function {
    // source - https://www.brianheinold.net/java/java_book.html#sec_functionexercises
    // 147 billing with tips
    private static double getBillTotal(double bill, double tipPercent){
        return bill * (1 + tipPercent);
    }
    // 153 swap 0-1
    private static String swap01(List<Integer> myList){
        List<Integer> inverseList = new ArrayList<Integer>();
        for(int n : myList) {
            if(n == 0){
                inverseList.add(1);
            } else {
                inverseList.add(0);
            }
        }
        return inverseList.toString();
    }
    //163 square root estimator
    private static double estimateSquareRoot(double n){
        final double accuracy = 10e-10d;

        double x = n;
        double prev;

        do {
            prev = x;
            x = (x + n/x) /2;
        } while(Math.abs(x - prev) > accuracy);

        return x;
    }

    //170 convert integer Base10 to Base5
    private static String convertToBaseN(int number, int base){
        StringBuilder BaseN = new StringBuilder();

        do {
            int remainder = (number % base);
            number = (number-remainder)/base;
            BaseN.append(remainder);
        } while( number > 0 );

        return BaseN.toString();
    }

    // 170-2 convert back to Base10
    private static int convertBase10(String number, int base){

        int base10 = 0;

        for(int i=0; i<number.length(); i++){
            int n = Integer.parseInt(number.substring(i,i+1));

        int xbase = (int) Math.pow(base,i);

            base10 += xbase * n;
        }

        return base10;
    }

    public static void main(String[] args) {
        double totalBill = getBillTotal(100.00, 0.05);
        System.out.println("Q147 " + totalBill);

        ArrayList<Integer> MyList01 = new ArrayList<Integer>();
        Collections.addAll(MyList01, 1, 0, 0, 0, 1, 1, 0, 1);
        String swap = swap01(MyList01);
        System.out.println("Q153 " + swap);

        double root = estimateSquareRoot(8);
        System.out.println("Q163 " + root);

        String base5 = convertToBaseN(55, 5);
        int base10 = convertBase10(base5, 5);
        System.out.println("Q170 " + base5);
        System.out.println("Q170 Check " + base10); //Should be 55
    }
}
