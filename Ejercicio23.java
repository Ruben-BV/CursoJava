import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número y te diré su tabla de multiplicar:");
        double x = scanner.nextInt();

        for(int i=1; i<=10; i++) {
            System.out.println(x + "*"+ i + "= "+ i*x);
        }

        scanner.close();
    }
}
