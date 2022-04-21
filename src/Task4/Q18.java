package Task4;
//18. Write a JAVA program to calculate profit or loss.

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the Cost price: ");
        int cp = scanner.nextInt();
        System.out.println("enter the selling price: ");
        int sp = scanner.nextInt();
        if (sp > cp) {
            System.out.println("you had profit.");
        }
        else{
            System.out.println("You had loss.");
        }
    }

}
