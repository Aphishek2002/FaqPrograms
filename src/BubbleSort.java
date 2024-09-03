import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array  = {4,81,-33,2,77};
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            for (int i = 0; i < lastUnsortedIndex; i++){
                if (array[i]  > array[i+1]){
                    swap(array,i,i+1);
                }
            }
        }
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }


    public static  void  swap(int[] array, int i, int j){
        if (i == j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
