package Task4;

import java.util.Scanner;

public class Q11{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the digit: ");
            int day=scanner.nextInt();
            if (day==1){
                System.out.println("sunday");
            }
            else if (day==2){
                System.out.println("monday");
            }
            else if (day==3){
                System.out.println("tuesday");
            }
            else if (day==4){
                System.out.println("wednesday");
            }
            else if (day==5){
                System.out.println("Thursday");
            }
            else if (day==6){
                System.out.println("friday");
            }
            else if (day==7){
                System.out.println("saturday");
            }
            else{
                System.out.println("default");
            }
        }
    }
