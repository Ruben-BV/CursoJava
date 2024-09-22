import javax.swing.JOptionPane;

public class Ejercicio20 {
    
    public static void main(String[] args) {

        String num = JOptionPane.showInputDialog("Introduce un número entero");

        int number = Integer.parseInt(num);

        char result = num.charAt(0);
        double div_dos = number % 2;
        double div_tres = number % 3;

        if(result!='-' && div_dos==0) {
            JOptionPane.showMessageDialog(null,"El número es positivo y par.");
        }
        else {
            JOptionPane.showMessageDialog(null,"No se cumple la comprobación de número positivo y par.");
        }

        if(result=='-' && div_tres==0) {
            JOptionPane.showMessageDialog(null,"El número es negativo y divisible entre tres.");
        }
        else {
            JOptionPane.showMessageDialog(null,"No se cumple la comprobación de número negativo y divisible entre tres.");
        }
        
    }
}
