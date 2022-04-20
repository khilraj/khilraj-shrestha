package Task2;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanners=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanners.nextLine();
        System.out.println("Enter your age: ");
        int age = scanners.nextInt();
        scanners.nextLine();
        System.out.println("Enter your address :");
        String address= scanners.nextLine();
        System.out.println("Your Name is\t"+ name);
        System.out.println("Your Age is\t"+ age);
        System.out.println("Your Address is\t"+ address);

    }
}
