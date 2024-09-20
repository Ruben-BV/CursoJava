import java.util.Random;

public class Ejercicio14 {
    public static void main(String[] args) {
        
        String caracteres = "abcdefghijklmnopqrstuvwxyz0123456789";
        
        for(int i=0; i<=7; i++) { 
            Random random = new Random();
            int dado1 = random.nextInt(5)+1;
            System.out.println(i);
        }
        

        int result = caracteres.length();
        System.out.println(result);
        //char result = name.charAt(0);

    }
}
