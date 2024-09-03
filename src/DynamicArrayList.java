import java.util.*;
public class DynamicArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> values = new ArrayList<>();
        System.out.println("Enter the number (enter a non integer to the array)to be in array");
        while (sc.hasNextInt()){
            int input = sc.nextInt();
            values.add(input);
        }
        System.out.println("Elements in an array : "+ values);
        Iterator<Integer> iterator = values.iterator();
        while (iterator.hasNext()){
            int num = iterator.next();
            if (num > 1000)
                iterator.remove();
        }
        System.out.println("Elements in array after condition : " + values);
    }
}
