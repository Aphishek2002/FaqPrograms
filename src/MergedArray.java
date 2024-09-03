public class MergedArray {
    public static void main(String[] args) {
        int[] arr1 = {22,56,77,88};
        int[] arr2 = {21,44,68,98};
        MergedArray(arr1,arr2);
    }

    public static void MergedArray(int[] arr1, int[] arr2){
        int s1 = arr1.length;
        int s2 = arr2.length;
        int[] mergedArray = new int[s1+s2];
         int i = 0,j = 0,k = 0;
        while (i < s1 && j< s2){
            if (arr1[i] <= arr2[j]){
                mergedArray[k] = arr1[i];
                i++;
            }else {
                mergedArray[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < s1) {
            mergedArray[k] = arr1[i];
            i++;
            k++;
        }

        // Copy remaining elements of arr2
        while (j < s2) {
            mergedArray[k] = arr2[j];
            j++;
            k++;
        }
        double median = 0;
        for (int n = 0; n < mergedArray.length; n++){
            System.out.print(mergedArray[n] + " ");
            int TotLen = mergedArray.length;
            int midValue = mergedArray.length / 2;
            if (midValue % 2 != 0){
                median = mergedArray[midValue];

            } else {
                median = (double) (mergedArray[midValue] + mergedArray[midValue -1])/2;
            }
        }
        System.out.println();
        System.out.println(median);

    }
}
