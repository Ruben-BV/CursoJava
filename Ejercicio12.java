import java.util.Random;

public class Ejercicio12 {
    
    public static void main(String[] args) {

        Random random = new Random();
        int x = random.nextInt(100)+1;
        
        System.out.println("Un número aleatorio entre el 1 y el 100, sería por ejemplo el: " + x);
    }
}
