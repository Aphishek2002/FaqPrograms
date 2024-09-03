import java.util.Scanner;

public class OddAndEvenOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i <= arr.length-1;i++){
            System.out.println("Enter " + i + " of array : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Even numbers");
        for (int i = 0;i <= arr.length-1;i++){
            if (arr[i] % 2 == 0)
                System.out.println(arr[i]);
        }
        System.out.println("Odd numbers");
        for (int i = 0;i <= arr.length-1;i++){
            if (arr[i] % 2 != 0)
                System.out.println(arr[i]);
        }
        
    }
}
