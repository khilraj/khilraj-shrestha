package Task4;

import java.util.Scanner;

public class Q14{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the angle: ");
        int angel1 = scanner.nextInt();
        System.out.println("enter the angle: ");
        int angle2 = scanner.nextInt();
        System.out.println("enter the angle: ");
        int angle3 = scanner.nextInt();
        int sum=angel1+angle3+angle2;
        if (sum==180) {
            System.out.println("Triangle is valid.");
        }
        else{
            System.out.println("triangle is invalid");
        }}}



