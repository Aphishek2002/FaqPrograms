import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int a[] = {12,14,16,18,20,22,24,26,28};
        int elem = Arrays.binarySearch(a,24);
        System.out.println("key element in array at :"+ elem);

    }
}
