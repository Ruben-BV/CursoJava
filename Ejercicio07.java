import java.util.Scanner;

public class Ejercicio07 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos a calcular la siguiente expresión: x + y * z");
        System.out.println("Introduce por favor, el valor deseado para x: ");
        double x = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Introduce por favor, el valor deseado para y: ");
        double y = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Introduce por favor, el valor deseado para z: ");
        double z = scanner.nextDouble();
        scanner.nextLine();

        double resultado = x + y * z;

        System.out.println("El resultado de la operación es: " + resultado);

        scanner.close();
    }
}
