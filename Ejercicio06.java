import java.util.Scanner;

public class Ejercicio06 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número entero x: ");
        int x = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Introduce un número entero y: ");
        int y = scanner.nextInt();
        scanner.nextLine();
        
        int z = x+y;

        System.out.println("La suma de los dos números introducidos es: " + z);

        scanner.close();
    }
}
