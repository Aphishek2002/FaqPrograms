public class Array2D {
    public static void main(String[] args) {
        int[][] arr2 = {
                {1,23,43,54},
                {2,34,56,78},
                {3,5,7,8,}
        };
        print2DArray(arr2);
    }

    static void print2DArray(int[][] a){
        for (int[] row:a){
            for (int val:row){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
