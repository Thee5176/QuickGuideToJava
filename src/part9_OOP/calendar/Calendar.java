package part9_OOP.calendar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://www.brianheinold.net/java/java_book.html#sec_varloopifexercises
//8.9.198 Print Calendar
public class Calendar {
    private int year;


    public Calendar(int year) {
        this.year = year;
    }

    //https://www.brianheinold.net/java/java_book.html#sec_varloopifexercises
    //8.1.13 うるう年ロジック
    public boolean isLeapYear() {
        boolean isLeap ;
        if(this.year % 400 == 0) {
            isLeap = true;
        } else if(this.year % 100 == 0) {
            isLeap = false;
        } else isLeap = this.year % 4 == 0;

        return isLeap;
    }

    //https://www.brianheinold.net/java/java_book.html#sec_varloopifexercises
    //8.1.13 1日の曜日計算ロジック
    public int firstDay(int m) {
        int y = this.year;
        int d = 1;

        // t : 0−6インデックスは日曜日から始まる
        int t;

        //計算ロジック
        int p = (14-m)/12;
        int q = y - p;
        int r = q + q/4 - q/100 + q/400;
        int s = m + 12*p - 2;
        t = (d + r + (31*s)/12) % 7;

        //デバッグ用
        //System.out.printf("%d/%d/1: %d \n",y,m,t);
        return t;
    }

    public int dayCount(int m){
        int dCount;

        int[] thirtyOneDay = {1,3,5,7,8,10,12};
        if(m == 2){
            dCount = this.isLeapYear() ? 29 : 28;
        } else if ( Arrays.binarySearch(thirtyOneDay, m) != -1) {
            dCount = 31;
        } else if (m > 0 && m <= 12 ){
            dCount = 30;
        } else {
            dCount = -1;
        }
        return dCount;
    }

    public void printCalendar(int m) {
        List<Integer> myCalendar= new ArrayList<>();

        //1日が日曜日以外の場合、空白パッディングの要素数
        int whiteSpace = this.firstDay(m);

        for(int i=1; i<=whiteSpace;i++){
            myCalendar.add(0);
        }

        //月の日数によりarrayの要素数を決める
        int daySpace = this.dayCount(m);

        for(int i=1; i<=daySpace;i++){
            myCalendar.add(i);
        }

        int count = 0;
        StringBuilder toPrint = new StringBuilder();
        for(int d : myCalendar){
            if (d == 0){
                toPrint.append("  ");
            } else {
                toPrint.append(String.format("%2d",d));
            }
            count += 1;
            toPrint.append("  ");

            //7日にちごとに新しい行列にする
            if(count % 7 == 0){
                toPrint.append("\n");
            }
        }

        System.out.println(toPrint.toString());
    }

    public static void main(String[] args) {
        Calendar c = new Calendar(2025);

        boolean checkLeapYear = c.isLeapYear();
        System.out.println(checkLeapYear);  //false

        int checkFirstDay = c.firstDay(4);
        System.out.println(checkFirstDay);  //2

        c.printCalendar(4);
    }
}
