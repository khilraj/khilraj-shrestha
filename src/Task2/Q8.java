package Task1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter length: ");
        int length = scanner.nextInt();
        int area = length*length;
        int perimeter= 4*length;
        System.out.println("The area of square is\t"+ area);
        System.out.println("Perimeter of square is\t"+perimeter);

    }
}

class SI{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter principle :" );
        double principle = scanner.nextDouble();
        System.out.println("Enter time: ");
        double time = scanner.nextDouble();
        System.out.println("Enter rate: ");
        double rate= scanner.nextDouble();
        double SI = (principle*time*rate)/100;
        System.out.println("SI: "+SI);

    }
}

class Area{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter length: ");
        int length= scanner.nextInt();
        System.out.println("Enter breadth: ");
        int breadth= scanner.nextInt();
        int area= length*breadth;
        System.out.println("The area of triangle is:\t"+area);

    }
}

class cube{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter length :");
        int length= scanner.nextInt();
        int volume= length*length*length;
        System.out.println("The volume of cube is:\t"+volume);
    }
}

class cuboid{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter length: ");
        int length = scanner.nextInt();
        System.out.println("Enter breadth: ");
        int breadth= scanner.nextInt();
        System.out.println("Enter height: ");
        int height= scanner.nextInt();
        int volume=length*breadth*height;
        System.out.println("The volume of cuboid is\t:"+volume);
    }
}