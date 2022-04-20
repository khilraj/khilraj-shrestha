package Task2;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a=scanner.nextInt();
        int sqr= (int) Math.pow(a,2);
        System.out.println("The square of the number is:"+sqr);

    }
}
