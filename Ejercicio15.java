import javax.swing.JOptionPane;

public class Ejercicio15 {
    public static void main(String[] args) {
        String numero = JOptionPane.showInputDialog("Introduce un número entero");

        int x = Integer.parseInt(numero);

        double y = x % 2;

        if (y == 0) {
            JOptionPane.showMessageDialog(null,"El número introducido es par.");
        }

        else {
            JOptionPane.showMessageDialog(null,"El número introducido es impar.");
        }
    }
}
