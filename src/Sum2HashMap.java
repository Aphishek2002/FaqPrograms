import java.util.*;
public class Sum2HashMap {
    public static void main(String[] args) {
        int[] arr = {10,7,4,6,11};
        int target = 13;
        int[] ans = new int[2];

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++){
            int sno = target - arr[i];
            if (map.containsKey(sno)){
                ans[0] = map.get(sno);
                ans[1] = i;
                break;
            }
            map.put(arr[i],i);
        }
        System.out.println(ans[0] + " " + ans[1]);

    }
}
