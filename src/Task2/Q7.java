package Task1;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your roll no :");
        int ROllNo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your interest :");
        String interest= scanner.nextLine();
        System.out.println("Hey! My Name is\t"+ name);
        System.out.println("My roll no is\t"+ ROllNo);
        System.out.println("My feild of interest are\t"+ interest);


    }
}
