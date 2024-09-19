import javax.swing.JOptionPane;

public class Ejercicio09 {
    
    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("¿Cómo te llamas?");
        JOptionPane.showMessageDialog(null,"¡Hola " + nombre + "! Te deseo un buen día."); 

    }
}
