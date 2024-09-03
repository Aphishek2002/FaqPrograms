import java.util.ArrayList;
import java.util.List;

public class KidWithGreatCandies {
    public static void main(String[] args) {
        int[] candies = {12,1,12};
        int extraCandies = 10;
        int[] result = new int[candies.length];
        List<String> res = new ArrayList<>();
        int i;
        for ( i = 0; i < candies.length; i++){
            System.out.println(candies[i]);
            candies[i] += extraCandies;
            System.out.println(candies[i]);
            System.out.println(candies.length);
            if (candies[i] >= candies.length){

                System.out.print("true" + " ");
                res.add("True");
            }
            else{
                System.out.print("False" + " ");
                res.add("False");
            }
        }
        System.out.println();
        System.out.println(res);
    }
}
