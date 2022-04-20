package Task3;

import javax.swing.*;

class Q5 {
    public static void main(String[] args) {
        int a= Integer.parseInt(JOptionPane.showInputDialog(null, "Enter First Number: "));
        int b= Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Second Number: "));

        int sum = a+b;
        int product = a*b;
        double division = (double) sum/product;

        JOptionPane.showMessageDialog(null, "Sum: "+sum+"\nProduct: "+product+"\nQuotient of Sum & Product: "+division);
    }
}

