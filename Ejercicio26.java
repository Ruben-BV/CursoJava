
public class Ejercicio26 {
    
    public static void main(String[] args) {

        int[][] matrix_A = 	{
            {2,0,1},
            {3,0,0},
            {5,1,1}
        };

        int[][] matrix_B = 	{
            {1,0,1},
            {1,2,1},
            {1,1,0}
        };

        int[][] mult = {
            {0,0,0},
            {0,0,0},
            {0,0,0}
        };
        

        for(int i=0; i < matrix_A[0].length; i++){
            for(int j=0; j < matrix_B.length; j++){
                int a=0;
                for(int k=0;k< matrix_B[0].length;k++){
                    a= a + matrix_A[i][k] * matrix_B[k][j];
                }
                mult[i][j]=a;
            }
        }
        
        for(int i=0; i<mult.length; i++) {
            System.out.println();
            for(int j=0; j<mult[i].length; j++) {
            System.out.print(mult[i][j]+" ");
            }
        }
    }
    
}
