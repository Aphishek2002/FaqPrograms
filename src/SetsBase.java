import java.util.*;
public class SetsBase {
    public static void main(String[] args) {
        String name = "pratheep";
//        StringBuilder
        char[] ch = name.toCharArray();
        Set<Character> c = new HashSet<>();
        c.add(name.charAt(0));
        c.add(name.charAt(1));
        c.add(name.charAt(2));
        c.add(name.charAt(3));
        c.add(name.charAt(4));
        c.add(name.charAt(5));
        c.add(name.charAt(6));
        c.add(name.charAt(7));
        System.out.println(c);
        c.toString();
        System.out.println(c);


//        Set<>
    }
}
