import javax.swing.JOptionPane;

public class Ejercicio10 {

    public static void main(String[] args) {

        String operacion = JOptionPane.showInputDialog("Esta calculadora te permite realizar operaciones sencillas con dos números.\r\n" + "Elige la operación deseada:\r\n" + "  - Suma: Pulsa el símbolo \"+\"\r\n" + "  - Resta: Pulsa el símbolo \"-\"\r\n" + "  - Multiplicación: Pulsa el símbolo \"*\"\r\n" + "  - División: Pulsa el símbolo \"/\"");
        
        if(operacion.equals("+")) {
            String sumando01 = JOptionPane.showInputDialog("Introduce el primer sumando");
            String sumando02 = JOptionPane.showInputDialog("Introduce el segundo sumando");
            double x = Double.parseDouble(sumando01);
            double y = Double.parseDouble(sumando02);
            double z = x+y;
            JOptionPane.showMessageDialog(null,sumando01 + "+" + sumando02 +"="+z);
        }
        else if(operacion.equals("-")) {
            String minuendo = JOptionPane.showInputDialog("Introduce el minuendo");
            String sustraendo = JOptionPane.showInputDialog("Introduce el sustraendo");
            double x = Double.parseDouble(minuendo);
            double y = Double.parseDouble(sustraendo);
            double z = x-y;
            JOptionPane.showMessageDialog(null,minuendo + "-" + sustraendo +"="+z);
        }
        else if(operacion.equals("*")) {
            String multiplicando = JOptionPane.showInputDialog("Introduce el multiplicando");
            String multiplicador = JOptionPane.showInputDialog("Introduce el multiplicador");
            double x = Double.parseDouble(multiplicando);
            double y = Double.parseDouble(multiplicador);
            double z = x*y;
            JOptionPane.showMessageDialog(null,multiplicando + "*" + multiplicador +"="+z);
        }

        else if(operacion.equals("/")) {
            String dividendo = JOptionPane.showInputDialog("Introduce el dividendo");
            String divisor = JOptionPane.showInputDialog("Introduce el divisor");
            double x = Double.parseDouble(dividendo);
            double y = Double.parseDouble(divisor);
            double z = x/y;
            JOptionPane.showMessageDialog(null,dividendo + "/" + divisor +"="+z);
        }

        else {
            JOptionPane.showMessageDialog(null,"No has elegido ninguna operación posible para esta calculadora");
        }


    // En caso de que el usuario elija la suma:
    //     - Introduce el primer sumando
    //     - Introduce el segundo sumando
    // En caso de que el usuario elija la resta:
    //     - Introduce el minuendo
    //     - Introduce el sustraendo
    // En caso de que el usuario elija la multiplicación:
    //     - Introduce el multiplicando
    //     - Introduce el multiplicador
    // En caso de que el usuario elija la división:
    //     - Introduce el dividendo
    //     - Introduce el divisor
    }
}