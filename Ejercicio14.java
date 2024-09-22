import java.util.Random;

public class Ejercicio14 {
    public static void main(String[] args) {
        
        String caracteres = "abcdefghijklmnopqrstuvwxyz0123456789";
        int longitud = caracteres.length();
        
        for(int i=0; i<=7; i++) {
            Random random = new Random();
            
            int car = random.nextInt(longitud);
            char result = caracteres.charAt(car);
            
            System.out.print(result);
            
        }
        
    }
}
