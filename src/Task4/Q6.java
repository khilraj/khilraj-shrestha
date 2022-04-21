package Task4;

import java.util.Scanner;

// to check whether a year is loop or not
public class Q6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year= in.nextInt();
        boolean leap = false;

        // if year is divisible by 4
        if (year%4==0){

            // if year is divisible by 100
            // if year is century
            if (year%100==0){

                // if year is divisible by 400
                // then it is a leap year
                if (year%400==0)
                    leap=true;
                else
                    leap=false;
            }
            // if the year is not century
            else
                leap=true;
        }
        else {
            leap=false;
        }
        if (leap)
            System.out.println(year + " is a leap year");
        else
            System.out.println(year + " is not a leap year");
    }
}
