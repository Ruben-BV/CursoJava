import java.util.Scanner;

public class Ejercicio05 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número entero: ");
        int num_entero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Introduce un número decimal: ");
        double num_decimal = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Si tuvieras un cerdito de mascota, ¿Cómo lo llamarías?");
        String nombre_cerdito = scanner.nextLine();

        System.out.println("Has escrito el número entero: " + num_entero);
        System.out.println("Has escrito el número decimal: " + num_decimal);
        System.out.println("El nombre de tu cerdito sería: " + nombre_cerdito);

        scanner.close();
    }
}
