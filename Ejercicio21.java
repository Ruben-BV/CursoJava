import javax.swing.JOptionPane;

public class Ejercicio21 {
    
    public static void main(String[] args) {
        
        String num = JOptionPane.showInputDialog("Introduce un número entero y calcularemos la suma \r\n" + "de los números naturales hasta dicho número.");
        int number = Integer.parseInt(num);

        int count = 0;
        int result = 0;

        while (count<number && number>=0) {
            result = result + count + 1;
            count = count + 1;
        }
        if (number>=0) {
            JOptionPane.showMessageDialog(null,"La suma es:"+result);
        }
        else {
            JOptionPane.showMessageDialog(null,"Esto no es un número natural");
        }
    }
}