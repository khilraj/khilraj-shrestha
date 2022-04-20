package Task1;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter length: ");
        double length = scanner.nextDouble();
        System.out.println("Enter breadth: ");
        double breadth = scanner.nextDouble();
        double area= length*breadth;
        // casting
        int castedArea= (int) (area);
        System.out.println("The Area of triangle: "+area);


    }
}
