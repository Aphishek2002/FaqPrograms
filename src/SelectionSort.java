public class SelectionSort {
    public static void main(String[] args) {
        int[] array1 = {11,2,-3,4,56,6};
        for (int lastUnsortedIndex = array1.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            int largest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++){
                if (array1[i] > array1[largest]){
                    largest = i;
                }
            }
            swap(array1,largest,lastUnsortedIndex);
        }
        printArray(array1);
    }

    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void printArray(int[] array){
        for (int i : array){
            System.out.println(i);
        }
    }
}
