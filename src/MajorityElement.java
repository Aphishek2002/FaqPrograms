import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i= 1; i < nums.length; i++){
            if (nums[i] == nums[i - 1]){
                map.put(nums[i-1],1);
            }
        }
        System.out.println(map);
    }
}
