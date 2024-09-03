import java.util.Arrays;

public class RotateArrayLeft {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int[] temp = new int[arr.length];
        int k = 0;
        int d = 2;
        for (int i = d; i < arr.length; i++){
            temp[k] = arr[i];
            k++;
        }
        for (int i = 0; i < d; i++){
            temp[k] = arr[i];
            k++;
        }

        for (int i = 0; i < arr.length; i++){
            arr[i] = temp[i];
        }

        System.out.print(Arrays.toString(arr));
    }
}
