import java.util.Random;

import javax.swing.JOptionPane;

public class Ejercicio22 {
    public static void main(String[] args) {

        Random random = new Random();
        int random_number = random.nextInt(100)+1;

        int counter = 0;

        String num = JOptionPane.showInputDialog("Estoy pensando un número entre el 1 y el 100. \r\n" + "Intenta adivinarlo!!");
        int user_number = Integer.parseInt(num);

        while (random_number != user_number) {
            counter = counter+1;

            if(user_number < random_number){
                String num01 = JOptionPane.showInputDialog("El número que estoy pensando es mayor.");
                user_number = Integer.parseInt(num01);
            }

            else {
                String num02 = JOptionPane.showInputDialog("El número que estoy pensando es menor.");
                user_number = Integer.parseInt(num02);
            }
        }

        JOptionPane.showMessageDialog(null, random_number + " -- Enhorabuena!! Lo has adivinado en " + counter + " intentos.");
    }
}
