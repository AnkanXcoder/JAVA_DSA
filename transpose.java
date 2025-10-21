public class transpose {
    public static void main(String[] args) {
        int row=2, col=3;
        //original
        int matrix[][] = {{2,3,7},{5,6,7}};
        printMatrix(matrix);
        //transpose
        int transpose[][] = new int[col][row];
        for(int i=0;i<row;i++){
            for(int j =0;j<col;j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        printMatrix(transpose);
    }
     public static void printMatrix(int matrix[][] ){
      
        System.out.println("The matrix is:");
        for (int[] matrix1 : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.println(matrix1[j] + " ");
            }
            System.out.println();
        }
        
     }

    }

