import java.util.*;
public class ArrayPractise2 {
    public static void main(String[] args) {
        int[] series = {2,7,11,15};
        int target =26;
        int i,j;
        Set<Integer> res = new LinkedHashSet<>();
        for ( i = 0; i < series.length; i++){
            for (j = i+1; j < series.length; j++){
                if (series[i] + series[j] == target) {
                    res.add(i);
                    res.add(j);
                    break;
                }
            }
        }
        System.out.println(res);
    }
}

