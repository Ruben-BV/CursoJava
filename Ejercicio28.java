public class Ejercicio28 {
    public static void main(String[] args) {
        
        int[] numbers = {1, 2, 3, 4, 5, 6};

        int mem01;
        int mem02;
        double num_of_changes = Math.floor(numbers.length/2);

        for(int i=0; i < num_of_changes; i++ ) {
            mem01=numbers[i];
            mem02=numbers[numbers.length-1-i];

            numbers[i]=mem02;
            numbers[numbers.length-1-i] = mem01;
        }

        for(int i=0; i < numbers.length; i++ ) {
            System.out.print(numbers[i]);
        }
        
    }
}
