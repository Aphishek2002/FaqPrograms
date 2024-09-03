import java.util.Arrays;

public class RotateArrayRight {
    public static void main(String[] args) {
        int[] arr = {1,3,4,6,7,8};
        int[] temp = new int[arr.length];
        int k = 3;
        int d = 0;
        for (int i = arr.length - k; i < arr.length; i++){
            temp[d] = arr[i];
            d++;
        }
        for (int i = 0; i < arr.length - k; i++){
            temp[d] = arr[i];
            d++;
        }
        System.out.print(Arrays.toString(temp));
    }
}
