package Task3;

import javax.swing.*;

class Q7 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null,"Enter Name: ");
        int roll = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Roll No.: "));
        String interest = JOptionPane.showInputDialog(null,"Enter Field of Interest: ");

        JOptionPane.showMessageDialog(null,"Hey, my name is "+name+" and my roll number is "+roll+". My field of interest is "+interest+".");
    }
}
