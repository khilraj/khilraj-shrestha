package Task3;

import javax.swing.*;

class Q2 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter another number: "));
        int c = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter another number: "));
        int d = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter another number: "));

        int sum = a+b+c+d;
        JOptionPane.showMessageDialog(null, "Sum of Numbers: "+sum);
        System.exit(0);
    }
}

