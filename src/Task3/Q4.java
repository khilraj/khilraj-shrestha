package Task3;

import javax.swing.*;

class Q4 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Enter another number: "));
        int sum = a+b;
        int product = a*b;

        JOptionPane.showMessageDialog(null,"Sum: "+sum+"\nProduct: "+product);
    }
}
