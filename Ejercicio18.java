import javax.swing.JOptionPane;

public class Ejercicio18 {
    public static void main(String[] args) {

        String num_intro = JOptionPane.showInputDialog("Introduce un número entero del 1 al 7 y te diré su correspondiente día de la semana");
    
        switch(num_intro) {
        case "1": JOptionPane.showMessageDialog(null,"El número 1 corresponde al Lunes");
        break;
        case "2": JOptionPane.showMessageDialog(null,"El número 2 corresponde al Martes");
        break;
        case "3": JOptionPane.showMessageDialog(null,"El número 3 corresponde al Miércoles");
        break;
        case "4": JOptionPane.showMessageDialog(null,"El número 4 corresponde al Jueves");
        break;
        case "5": JOptionPane.showMessageDialog(null,"El número 5 corresponde al Viernes");
        break;
        case "6": JOptionPane.showMessageDialog(null,"El número 6 corresponde al Sábado");
        break;
        case "7": JOptionPane.showMessageDialog(null,"El número 7 corresponde al Domingo");
        break;
        default: JOptionPane.showMessageDialog(null,"Esto no es un número entero del 1 y el 7");
        }
    }
}
