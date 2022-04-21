package Task4;
// to find maximum between three numbers

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

// first way without taking user input
public class Q2 {
        public static void main(String[] args) {
                int first= 5;
                int second=45;
                int third=44;
                int a= Math.max(first,second);
                int result = Math.max(a,third);
                System.out.println("Maximum between three number is: "+ result);
        }
}

/// taking user input
class Maximum {
        public static void main(String[] args) {
                Scanner in= new Scanner(System.in);
                System.out.println("Enter first number: ");
                int first= in.nextInt();
                System.out.println("Enter second number: ");
                int second = in.nextInt();
                System.out.println("Enter third number: ");
                int third = in.nextInt();
                int x= Math.max(first,second);
                int result= Math.max(x,third);
                System.out.println("Maximum between three number is: "+ result);
        }
}
