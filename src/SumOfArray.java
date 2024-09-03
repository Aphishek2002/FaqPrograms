import java.util.*;

public class SumOfArray {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of array:");
//        int size = sc.nextInt();
//        int[] arr = new int[size];
//        for (int i = 0; i <= arr.length-1;i++){
//            System.out.println("Enter " + i + " of array : ");
//            arr[i] = sc.nextInt();
//        }
//        int sum = 0;
//        for (int i=0;i <= arr.length - 1 ; i++){
//            System.out.print(arr[i] + " ");
//            sum = sum + arr[i];
//        }
//        System.out.println("Sum of array: "+ sum);
//        int[] arr = {4,6,1,3,9,7};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        int[][] array2d = {{1,2,3}, {4,5,6}, { 7,8,9}};
        int n = array2d.length;
        int m = array2d[0].length;
//        for (int i = 0;i < n; i++){
//            for (int j = 0; j < m; j++){
////                System.out.print(array2d[i][j] + " ");
//                int temp = array2d[i][j];
//                array2d[i][j] = array2d[j][i];
//                array2d[j][i] = temp;
//                System.out.print(array2d[i][j] + " ");
//            }
//        }
        System.out.println();
        System.out.println(Arrays.deepToString(array2d));
        int i = 0;
        int j = m -1;
        while (i < j){
            for (int k = 0; k < array2d.length; k++){
                int temp = array2d[k][i];
                array2d[k][i] = array2d[k][j];
                array2d[k][j] = temp;
                System.out.print(array2d[k][i] + " ");
            }
            i++;
        }
        System.out.println();
        System.out.println(Arrays.deepToString(array2d));
    }

    public static Set<Integer> doUnion(int[] a, int n, int[] b, int m){
        Set<Integer> resultSet = new LinkedHashSet<>();
        for (int num : a){
            resultSet.add(num);
        }
        for (int num : b){
            resultSet.add(num);
        }
        return resultSet;
    }
}
