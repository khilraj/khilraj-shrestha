package Task4;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter a character: ");
        char cha=in.next().charAt(0);
        if (cha>='A'&& cha <='z'){
            System.out.println(cha+" is an upper case.");
        }
        else if(cha>='a' && cha<='z') {
            System.out.println(cha+" is a lower case.");
        }
        else {
            System.out.println(cha+" is not alphabet");
        }
    }
}
