import javax.swing.JOptionPane;

public class Ejercicio33 {
    public static void main(String[] args) {
        
        String numero_introducido = JOptionPane.showInputDialog("Introduce un número ENTERO y le sumaremos 10:");
        

        try {
            Integer numero = Integer.valueOf(numero_introducido);
            
            int resultado = numero + 10;
            
            System.out.println("El resultado es: " + resultado);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error: La cadena introducida no es un número entero válido.");
            
        }
    }
}
