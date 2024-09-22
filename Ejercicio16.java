import javax.swing.JOptionPane;

public class Ejercicio16 {
    
    public static void main(String[] args) {
        
        int anno_ref= 2000;

        String x = JOptionPane.showInputDialog("Introduce un año y te diré si es bisiesto");
        int anno_dado = Integer.parseInt(x);

        int y = Math.abs(anno_ref - anno_dado) % 4;

        if(y==0){
            JOptionPane.showMessageDialog(null,"El año introducido es bisiesto");
        }

        else {
            JOptionPane.showMessageDialog(null,"El año introducido NO es bisiesto");
        }

    }
    // Tomo un año de referencia
    // Le resto el año que me indiquen
    // Saco el módulo del resultado de la resta
    // Este módulo lo divido entre 4
    // Si el resto es 0, entonces el año es bisiesto
    // Si no... el año no es bisiesto
}
