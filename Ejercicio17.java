import javax.swing.JOptionPane;

public class Ejercicio17 {
    public static void main(String[] args) {

        String operacion = JOptionPane.showInputDialog("Esta calculadora te permite realizar operaciones sencillas con dos números.\r\n" + "Elige la operación deseada:\r\n" + "  - Suma: Pulsa el símbolo \"+\"\r\n" + "  - Resta: Pulsa el símbolo \"-\"\r\n" + "  - Multiplicación: Pulsa el símbolo \"*\"\r\n" + "  - División: Pulsa el símbolo \"/\"");

    
        switch(operacion) {

        case "+":
            String sumando01 = JOptionPane.showInputDialog("Introduce el primer sumando");
            String sumando02 = JOptionPane.showInputDialog("Introduce el segundo sumando");
            double sum01 = Double.parseDouble(sumando01);
            double sum02 = Double.parseDouble(sumando02);
            double suma = sum01+sum02;
            JOptionPane.showMessageDialog(null,sumando01 + "+" + sumando02 + "=" + suma);
        break;

        case "-":
            String minuendo = JOptionPane.showInputDialog("Introduce el minuendo");
            String sustraendo = JOptionPane.showInputDialog("Introduce el sustraendo");
            double minu = Double.parseDouble(minuendo);
            double sust = Double.parseDouble(sustraendo);
            double diferencia = minu-sust;
            JOptionPane.showMessageDialog(null,minuendo + "-" + sustraendo + "=" + diferencia);
        break;

        case "*":
            String multiplicando = JOptionPane.showInputDialog("Introduce el multiplicando");
            String multiplicador = JOptionPane.showInputDialog("Introduce el multiplicador");
            double x = Double.parseDouble(multiplicando);
            double y = Double.parseDouble(multiplicador);
            double z = x*y;
            JOptionPane.showMessageDialog(null,multiplicando + "*" + multiplicador +"="+z);
        break;

        case "/":
            String dividendo = JOptionPane.showInputDialog("Introduce el dividendo");
            String divisor = JOptionPane.showInputDialog("Introduce el divisor");
            double dividendo_introducido = Double.parseDouble(dividendo);
            double sustraendo_introducido = Double.parseDouble(divisor);
            double cociente = dividendo_introducido/sustraendo_introducido;
            JOptionPane.showMessageDialog(null,dividendo + "/" + divisor + "=" + cociente);
        break;

        }
    }
}
