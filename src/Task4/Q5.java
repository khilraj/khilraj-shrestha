package Task4;

import java.util.Scanner;

// to check whether a number is even or odd
public class Q5 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num= in.nextInt();
        if (num%2==0){
            System.out.println("A number is even.");
        }
        else
            System.out.println("A number is odd.");

    }
}
