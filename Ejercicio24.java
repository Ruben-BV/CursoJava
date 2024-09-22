import javax.swing.JOptionPane;

public class Ejercicio24 {
    public static void main(String[] args) {

        int factorial = 1;
        String num = JOptionPane.showInputDialog("Introduce un número NATURAL y te calcularé su factorial");
        int number = Integer.parseInt(num);

        if(number == 0) {
            JOptionPane.showMessageDialog(null,"El factorial de 0 es: 0");
        }
        else if(number > 0) {
            for(int i=1; i<=number; i++) {
                factorial = factorial*i;
            }
            JOptionPane.showMessageDialog(null,"El factorial de "+ number +" es: " + factorial);
        }
        else {
            JOptionPane.showMessageDialog(null,"Por favor, introduce un número positivo,\r\n" + "los números negativos no son NATURALES");
        }
    }
}
