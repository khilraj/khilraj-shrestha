package Task4;
//12. Write a JAVA program to input month number and print number of days in that month.

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the digit: ");
        int day=scanner.nextInt();
        if (day==1){
            System.out.println("Baisakh has 30 days");
        }
        else if (day==2){
            System.out.println("jestha has 30 days");
        }
        else if (day==3){
            System.out.println("Aasar has 30 days");
        }
        else if (day==4){
            System.out.println("Shrawan has 30 days");
        }
        else if (day==5){
            System.out.println("Bhadra has 30 days");
        }
        else if (day==6){
            System.out.println("Ashwoj has 30 days");
        }
        else if (day==7){
            System.out.println("Kartik has 30 days");
        }
        else if (day==8){
            System.out.println("Mangsir has 30 days");
        }
        else if (day==9){
            System.out.println("Poush has 30 days");
        }
        else if (day==10){
            System.out.println("Magh has 30 days");
        }
        else if (day==11){
            System.out.println("Falgun has 30 days");
        }
        else if (day==12){
            System.out.println("Chaitra has 30 days");
        }
        else{
            System.out.println("default");
        }
    }
}
