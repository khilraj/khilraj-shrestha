// write a program to calculate SI
package Task1;

public class Simple_interest {
    public static void main(String[] args) {
        int principle= 100;
        int time = 20;
        int rate= 50;
        float SI = (principle*time*rate)/100;
        System.out.println("The simple interest is \t"+ "Rs." + SI);
    }
}
