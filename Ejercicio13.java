import java.util.Random;

public class Ejercicio13 {
    
    public static void main(String[] args) {
        
        Random random = new Random();
        int dado1 = random.nextInt(5)+1;
        int dado2 = random.nextInt(5)+1;

        System.out.println("Vamos a tirar dos dados de 6 caras. Uno azul y otro rojo");
        System.out.println("En el dado azul sale un: " + dado1);
        System.out.println("En el dado rojo sale un: " + dado2);
        
        int suma = dado1 + dado2;

        System.out.println("El resultado total de la tirada es de: " + suma);
    }
}
