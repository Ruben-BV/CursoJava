import javax.swing.JOptionPane;

public class Ejercicio31 {
    
    public static void main(String[] args) {
        String cadena = JOptionPane.showInputDialog("Introduce una cadena de texto y te diré si es un palíndromo:");

        double num_de_comprobaciones = Math.floor(cadena.length()/2);
        
        String low_case = cadena.toLowerCase();
        int pal = 0;
        for(int i=0; i < num_de_comprobaciones; i++) {
            char char01=low_case.charAt(i);
            char char02=low_case.charAt(cadena.length()-i-1);
            if(char01 == char02) {
                pal = pal+1;
            }
        }
        if(pal==num_de_comprobaciones){JOptionPane.showMessageDialog(null,"La cadena introducida es un palíndromo.");}
        else{JOptionPane.showMessageDialog(null,"La cadena introducida NO es un palíndromo.");}
    }

}
