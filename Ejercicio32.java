public class Ejercicio32 {
    
    public static void main(String[] args) {

        int counter = 0;
        String vocales = "AEIOUaeiou";

        String cadena = JOptionPane.showInputDialog("Introduce una cadena de texto y te diré cuántas vocales tiene:");

        for(int i=0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            for(int j=0; j < vocales.length(); j++){
                char vocal = vocales.charAt(j);
                if(caracter == vocal){
                    counter = counter + 1;
                }
            }
        }
        
        if(counter==0){JOptionPane.showMessageDialog(null,"Tu cadena NO tiene vocales.");}
        else if(counter==1){JOptionPane.showMessageDialog(null,"Tu cadena tiene: " + counter +" vocal.");}
        else {JOptionPane.showMessageDialog(null,"Tu cadena tiene: " + counter +" vocales.");}
        
        
    }
}
