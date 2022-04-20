package Task2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter first int: ");
        int first= scanner.nextInt();
        System.out.println("Enter second int: ");
        int second= scanner.nextInt();
        System.out.println("Enter third int: ");
        int third= scanner.nextInt();
        System.out.println("Enter fourth int: ");
        int fourth= scanner.nextInt();
        int sum = first+second+third+fourth;
        System.out.println("The sum of four interger is"+ sum);



    }
}
