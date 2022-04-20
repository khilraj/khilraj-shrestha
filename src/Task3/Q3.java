package Task3;

import javax.swing.*;

class Q3 {
    public static void main(String[] args) {
        String[] subjects = {"Maths", "Software Design", "LED", "Programming"};
        double marks = 0;

        for (String i : subjects) {
            int mark = Integer.parseInt(JOptionPane.showInputDialog("Enter marks in " + i + ": "));
            marks=marks+mark;
        }

        double total = marks;
        double percentage = total / 4;
        String res;
        if (percentage >= 70) {
            res=("Result: First Class");
        } else if (percentage > 59) {
            res=("Result: Upper Second Class");
        } else if (percentage > 49) {
            res=("Result: Second Class");
        } else if (percentage >= 40) {
            res=("Result: Third Class");
        } else {
            res=("Result: Fail");
        }
        JOptionPane.showMessageDialog(null,"Total Marks: " + total + "\nPercentage: " + percentage + "\u0025\n"+res);
    }
}


