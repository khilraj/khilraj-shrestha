package Task4;
// check whether it is vowel or consonant

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
       char character='x';
        if (character=='a'|| character=='i'|| character=='e'||character=='o'||character=='u'){
            System.out.println(character+ " is a vowel.");
        }
        else
            System.out.println(character+" is consonent.");
    }
}


// taking user input

class VowelConsonent{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any character: ");
        char a= in.next().charAt(0);
        if (a=='a'|| a=='i'|| a=='e'||a=='o'||a=='u'){
            System.out.println(a+ " is a vowel.");
        }
        else
            System.out.println(a+" is consonent.");
    }
}