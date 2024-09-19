import java.util.Scanner;

public class Ejercicio08 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos a calcular el área de un círculo");
        System.out.println("Por favor, introduce el RADIO del círculo en mm");
        int x = scanner.nextInt();
        scanner.nextLine();

        double area = Math.PI*x*x;

        System.out.println("El área del círculo es: " + area + "mm²");

        scanner.close();
    }
}
