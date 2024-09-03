import java.util.*;
public class CloclWiseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i =0;i< a.length;i++){
            System.out.println("Enter " + i + "of array : ");
            a[i] = sc.nextInt();
        }
        for (int i = 0;i<a.length;i++){
            System.out.print( a[i] + "  ");
        }

        int temp = a[a.length-1];
        for (int i = a.length -1;i>0;i--){
            a[i] = a[i-1];
        }
        a[0] = temp;

        for (int i = 0;i<a.length;i++){
            System.out.print( a[i] + " ");
        }
    }


}
