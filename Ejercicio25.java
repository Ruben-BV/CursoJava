import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int filas;
		String simbolo = "";
		
		System.out.println("Vamos a crear un patrón piramidal");
        System.out.println("Introduce el número de líneas deseado:");
		filas = scanner.nextInt();
        System.out.println("Introduce el símbolo que quieres utilizar para tu patrón:");
        simbolo = scanner.next();
        
        for(int i=0; i<filas; i++) {
            System.out.println();
            for(int j=0; j<=i; j++) {
                System.out.print(simbolo);
            }
        }
        scanner.close();
    }
}
