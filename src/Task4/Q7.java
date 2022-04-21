package Task4;
// to check whether a character is alphabet or not

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        char c= 'x';
        if ((c>='a' && c<='z')|| (c>='A'&& c<='z')){
            System.out.println(c + " is an alphabet");
        }
        else
            System.out.println(c+" is not an alphabet");

    }
}


//taking user input

class Alphaornot{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter anu character: ");
        char c= scanner.next().charAt(0);
        if ((c>='a' && c<='z')|| (c>='A'&& c<='z')){
            System.out.println(c + " is an alphabet");
        }
        else
            System.out.println(c+" is not an alphabet");
    }
}



// using ternary
class Alphabet{
    public static void main(String[] args) {
      char c= 's';
      String result;
      result= ((c>='a' && c<='z')|| (c>='A'&& c<='z'))? c+ " is an alphabet" : c+ " is not an alphabet.";
        System.out.println(result);
    }
}
