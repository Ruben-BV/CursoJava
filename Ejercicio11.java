import java.util.Scanner;

public class Ejercicio11 {
    
    public static void main(String[] args) {

        double x;
        double y;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce un número x (positivo): ");
        x = scanner.nextDouble();
        System.out.println("Introduce un número y (puede ser negativo): ");
        y = scanner.nextDouble();

        System.out.println("El valor de " + x + " elevado a " + y + " es: " + Math.pow(x,y));
        System.out.println("El valor de la raíz cuadrada de " + x + " es: " + Math.sqrt(x));
        System.out.println("El valor absoluto de " + y + " es: " + Math.abs(y));


        scanner.close();

    }
}
