import java.util.*;
public class FindMissingNumber {
    public static void main(String[] args) {
        int[] series1 = {99,101,104,102,100};
        //to find missing number: 103
        Arrays.sort(series1);
        int missingVale = 0;
        System.out.println(Arrays.toString(series1));
        for (int i = 0; i < series1.length - 1; i++){
            if (series1[i] + 1 != series1[i+1])
                missingVale = series1[i] + 1;
        }
        System.out.println(missingVale);
    }
}
