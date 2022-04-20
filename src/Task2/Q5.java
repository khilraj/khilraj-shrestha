package Task2;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter first int: ");
        int first= scanner.nextInt();
        System.out.println("Enter second int: ");
        int second= scanner.nextInt();
        int sum = first+second;
        System.out.println("The sum of two integer is"+ sum);
        int product= first*second;
        System.out.println("The product of two integer is"+ product);
        double division = product/sum;
        System.out.println("the division of resulted sum and product is"+ division);


    }
}
