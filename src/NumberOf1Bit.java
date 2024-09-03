import java.util.*;
import java.util.stream.Collectors;
public class NumberOf1Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> myArray = new LinkedHashSet<>();
        for (int i = 0; i < n; i++ ){
            int ip = sc.nextInt();
            myArray.add(ip);
        }
        System.out.println(myArray);
    }

}
