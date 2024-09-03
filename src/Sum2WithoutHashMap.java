import java.util.Arrays;
public class Sum2WithoutHashMap {
    public static void main(String[] args) {
        int[] anArray = {7,5,8,2,9,4};
        int target = 7;
        for (int num:anArray){
            System.out.print(num + " ");
        }
        Arrays.sort(anArray);
        System.out.println("  ");
        for (int num : anArray){
            System.out.print(num + " ");
        }
        System.out.println(" ");
        int left = 0;
        int right = anArray.length - 1;
        while (left < right){
            int current_sum = anArray[left] + anArray[right];
            if (current_sum == target){
                System.out.println(anArray[left] + " " +anArray[right]);
                break;
            } else if (current_sum < target) {
                left++;
            }else {
                right--;
            }
        }

    }
}
