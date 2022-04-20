package Task3;
import javax.swing.JOptionPane;

class Q1 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null,"Enter Your Name: ");
        String address = JOptionPane.showInputDialog(null,"Enter Address: ");
        int age = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Age: "));
        JOptionPane.showMessageDialog(null, "Name: "+name+"\nAddress: "+address+"\nAge: "+age);
        System.exit(0);
    }
}
