import javax.swing.JOptionPane;


public class Ejercicio19 {
    
    public static void main(String[] args) {

        String edad_intro = JOptionPane.showInputDialog("Introduce tu edad para comprobar si eres elegible para votar");

        double edad = Double.parseDouble(edad_intro);

        if(edad >= 18 && edad <= 125){
            JOptionPane.showMessageDialog(null,"Eres elegible para votar");
        }
        else if(edad >125) {
            JOptionPane.showMessageDialog(null,"No te creo, a esa edad ya deberías estar en mejor vida...");
        }
        else if(edad >= 0 && edad < 18){
            JOptionPane.showMessageDialog(null,"NO eres elegible para votar pequeñajo");
        }
        else {
            JOptionPane.showMessageDialog(null,"Eso es imposible!");
        }
    }
}
