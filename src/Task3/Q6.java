package Task3;

import javax.swing.*;

class Q6 {
    public static void main(String[] args) {
        double length = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter length: "));
        double breadth = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter breadth: "));

        double area=length*breadth;
        int intArea = (int) area;

        JOptionPane.showMessageDialog(null,"Area of Rectangle: "+intArea+" unit\u00b2");
    }
}


