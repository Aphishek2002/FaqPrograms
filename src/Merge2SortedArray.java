import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Merge2SortedArray {
    public static void main(String[] args) {
        int[] nums1 = { 1,2,3,0,0,0};
        int m = 3;
        int [] nums2 = {2,5,6};
        int n = 3;
        Set<Integer> set = new HashSet<>();
//        for (int i = m; i < m + n; i++){
//            int j = 0;
//            nums1[i] = nums2[j];
//            j++;
//       }
        int i = m;  // i = 3
        int j =0 ;
        while (i < m + n && j < n ){
            nums1[i] = nums2[j];
            i++;
            j++;
       }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
