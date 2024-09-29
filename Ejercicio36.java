import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio36 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> lista = new ArrayList<String>();

        lista.add("Mesa");
        lista.add("Mesa");
        lista.add("Mesa");
        lista.add("Mesa");
        lista.add("Mesa");
        lista.add("Mesa");
        lista.add("Mesa");
        lista.add("Mesa");
		lista.add("Armario");
        lista.add("Estantería");
        lista.add("Silla");
        lista.add("Mesa");
        lista.add("Bolígrafo");
        lista.add("Mesa");
        lista.add("Silla");
        lista.add("Silla");
        lista.add("Bolígrafo");
        lista.add("Silla");
        lista.add("Pelota");
        lista.add("Pelota");
        lista.add("Pelota");
        lista.add("Pelota");

        System.out.println("Lista inicial: " + lista);
        System.out.println(lista.size());


        for (int i=0; i < lista.size(); i++) {
            boolean lista_remove=false;
            for (int j=i+1; j < lista.size() ; j++){
                if(lista.get(i).equals(lista.get(j))){
                lista.remove(i);
                lista_remove=true;
                i=0;
                j=i+1;
                }
                
            }
        }

        System.out.println("Lista sin duplicados: " + lista);

        scanner.close();
    }
}
