import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio35 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> enteros = new ArrayList<Integer>();

        int suma = 0;
        boolean ver_solucion = false;
        int pregunta;

        while (ver_solucion == false) {
            System.out.println("Introduce un número ENTERO para añadir a la suma:");
            int nuevo_sumando = scanner.nextInt();
            
            enteros.add(nuevo_sumando);

            pregunta =2;
            while(pregunta != 0 && pregunta != 1) {
                System.out.println("Quieres añadir un nuevo sumando?\r\n" + "[1] Sí \r\n" + "[0] Ver solución");
                pregunta = scanner.nextInt();

                if(pregunta==1){
                    ver_solucion = false;
                }
                else if (pregunta==0){
                    ver_solucion = true;
                }
            }
        }
        
        System.out.println("Has introducido los siguientes números:");
        for(int i=0; i<enteros.size(); i++) {
            System.out.print(enteros.get(i) + "  ");
            
        }

        System.out.println("");
        System.out.println("La suma de los números introducidos es:");

        for(int i=0; i<enteros.size(); i++) {
            suma = suma + enteros.get(i);
        }
        
        System.out.println(suma);

        scanner.close();
        
    }
}
