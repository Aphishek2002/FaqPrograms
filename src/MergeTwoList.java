import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class MergeTwoList {
    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<>();
        List<Integer> list2 = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10;i++){
            list1.add(sc.nextInt());
            list2.add(sc.nextInt());
        }
        System.out.println(list1);
        System.out.println(list2);
        List<Integer> resList = new ArrayList<>();
        resList.addAll(list1);
        resList.addAll(list2);
        System.out.println(resList);



    }
}
