public class Ejercicio30 {
    
    public static void main(String[] args) {
        Integer[][] matrix_A = 	{
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        Integer[][] matrix_transp = {
            {0,0,0},
            {0,0,0},
            {0,0,0}
        };

        for(int i=0; i < matrix_A.length; i++){
            System.out.println();
            for(int j=0;j<matrix_A[i].length;j++){
                matrix_transp [i][j]= matrix_A[j][i];
                System.out.print(matrix_transp[i][j]+" ");
            }
        }
        
    }
}
