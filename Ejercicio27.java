public class Ejercicio27 {
    public static void main(String[] args) {
        
        int[] numbers = {45, 23, 52, 128, -32};
        int max = numbers[0];
        for(int i=0; i<numbers.length; i++) {
			if (numbers[i] > max){
                max = numbers[i];
            }
		}
        System.out.println(max);
    }
}
