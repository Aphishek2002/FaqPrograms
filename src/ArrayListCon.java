import java.util.*;
public class ArrayListCon {
    public static void main(String[] args) {
        ArrayList<Integer> targets = new ArrayList<>();
        targets.add(7);
        targets.add(17);
        targets.add(27);
        targets.add(37);
        targets.add(47);

//        for (int s : targets){
//            System.out.println(s);
//        }
        int len = targets.size();
        System.out.println(len);
        System.out.println(targets.contains(100));
        System.out.println(targets);
//        targets.re
        System.out.println(targets.get(0));
        Object[] objects = targets.toArray();
        for (Object s:objects){
            System.out.print(s + " ");
        }
          
    }
}
