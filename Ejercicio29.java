public class Ejercicio29 {
    
    public static void main(String[] args) {
        Integer[][] matrix_A = 	{
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        Integer[][] matrix_B = 	{
            {10,11,12},
            {13,14,15},
            {16,17,18}
        };

        Integer[][] sum = {
            {0,0,0},
            {0,0,0},
            {0,0,0}
        };

        for(int i=0; i < matrix_A.length; i++){
            System.out.println();
            for(int j=0;j<matrix_A[i].length;j++){
                sum [i][j]= matrix_A[i][j] + matrix_B[i][j];
                System.out.print(sum[i][j]+" ");
            }
        }
        
    }
}
