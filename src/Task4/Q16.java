package Task4;
//16. Write a JAVA program to check whether the triangle is equilateral, isosceles or scalene triangle.

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the side: ");
        int side1 = scanner.nextInt();
        System.out.println("enter the side: ");
        int side2 = scanner.nextInt();
        System.out.println("enter the side: ");
        int side3 = scanner.nextInt();
        if ((side1 == side2) && (side3 == side2)) {
            System.out.println("Triangle is equilateral.");
        }
        else if ((side1 == side2) || (side3 == side2)) {
            System.out.println("Triangle is isosceles.");
        }
        else{
            System.out.println("Triangle is scalene.");
        }
    }

}
