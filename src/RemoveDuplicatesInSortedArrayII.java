import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesInSortedArrayII {
    public static void main(String[] args) {
        int[] nums  = {1,1,1,2,2,2,3,3};
        int count = 1;
        int appear = 1;
        for (int i = 1; i < nums.length; i++){
            if (nums[i ] == nums[i - 1]){
                if (appear == 1) {
                    nums[count] = nums[i];
                    count++;
                    appear++;
                } else if (appear == 2) {
                    continue;
                }
            }
            else {
                nums[count] = nums[i];
                count++;
                appear = 1;
            }
        }
        System.out.println(count);
        System.out.println(Arrays.toString(nums));
    }
}
