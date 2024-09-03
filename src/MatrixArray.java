import java.util.Arrays;

public class MatrixArray {
    public static void main(String[] args) {
        int[][] matrixArr = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] transMatrix = new int[3][3];
        for (int row = 0; row < 3; row++){
            for (int col = 0; col < 3; col++){
                transMatrix[row][col] = matrixArr[col][row];
            }
        }
        for (int row = 0; row < 3; row++){
            for (int col = 0; col < 3; col++){
                System.out.print(transMatrix[row][col] + " ");  //= matrixArr[col][row];
            }
        }
        System.out.println();
        System.out.println(Arrays.deepToString(matrixArr));
        System.out.println(Arrays.deepToString(transMatrix));
    }
}

