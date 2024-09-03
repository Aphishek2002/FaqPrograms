import java.util.*;
public class PairsDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i=0; i <= array.length - 1; i++){
            System.out.println("Enter " + i + " of array : ");
            array[i] = sc.nextInt();
        }
        for (int i=0;i <= array.length - 1 ; i++){
            System.out.print(array[i] + " ");
//            sum = sum + arr[i];
        }
        int k = sc.nextInt();
        System.out.println("The no.of pairs returned the target : c" + pairsDifference(array,k));

    }

    public static int pairsDifference(int[] arr, int target){
        int noOfPairs = 0;
        int i =0;
        for (i = 0; i < arr.length; i++){
            for (int j = i+1 ; j < arr.length; j++){
                int difference = arr[j] - arr[i];
                if (difference == target || difference == -target){
                    noOfPairs++;
                }
            }
        }
        return noOfPairs;
    }
}
