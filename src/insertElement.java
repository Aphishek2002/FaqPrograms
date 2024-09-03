import java.util.Arrays;

public class insertElement {
    public static void main(String[] args) {
        int[] Arr = {1,20,5,78,30};
        System.out.println(insertAtPos(2,7,Arr));
        System.out.println(Arrays.toString(Arr));
    }
    public static int[] insertAtPos(int pos, int ele, int[] Arr){

        int size = Arr.length - 1;
        if (pos <= size && pos >= 0) {
            for (int i = size; i > pos; i--) {
                Arr[i] = Arr[i - 1];
            }
            Arr[pos] = ele;
            return Arr;
        }
        return null;
    }
}
