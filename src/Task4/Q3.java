package Task4;
// to check whether a number is positive,negative or zero

import java.util.Scanner;

// without taking user input
public class Q3 {
    public static void main(String[] args) {
        int i=-5;
        if (i>=0){
            System.out.println("A number is positive.");
        }
        else
            System.out.println("A number is negative.");
    }

}

// by taking user input
class Check{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num= in.nextInt();
        if (num>=0){
            System.out.println("A number is positive.");
        }
        else
            System.out.println("A number is negative.");

    }
}