package Diziler_Bolumu;

//TODO Ödev - Matris Transpozunu Bulma
public class Odev3_Tranpose {

    static int[][] transpose(int[][] matrix){
        int[][] newMatrix=new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                newMatrix[j][i]=matrix[i][j];
            }
        }
        return newMatrix;
    }

    public static void matrixShow(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+"");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] matrix=new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };

        matrixShow(matrix);

        System.out.println();
        matrix=transpose(matrix);

        matrixShow(matrix);

    }
}
