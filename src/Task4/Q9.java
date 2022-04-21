package Task4;
// to check whether it is alphabet,digit or special

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter any charcater: ");
        char cha = in.next().charAt(0);
        if((cha >= 'a' && cha <= 'z') || (cha >= 'A' && cha <= 'Z')) {
            System.out.println(cha + " is a Alphabet.");
        }
        else if (cha>='0'&&cha<='9'){
            System.out.println(cha + " is a Digit.");
        }
        else {
            System.out.println(cha+" is a Special Character");
        }

        }
}
