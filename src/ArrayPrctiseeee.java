import java.util.*;
public class ArrayPrctiseeee {
    public static void main(String[] args) {
       String s = "A man, a plan, a canal: panama";
       String shortS = s.toLowerCase();
        System.out.println(shortS);
        String sortedS = "";
        for (int i = 0; i < shortS.length(); i++){
            if (shortS.charAt(i) == ' ' || shortS.charAt(i) == ',' || shortS.charAt(i) == ':')
                continue;
            sortedS += shortS.charAt(i);
        }
        System.out.print(sortedS);
        System.out.println();
        String reversedS = "";
        for (int i = sortedS.length() - 1;i >= 0; i--){
            reversedS +=  sortedS.charAt(i);
        }
        System.out.print(reversedS);
        System.out.println();
        if (sortedS.equals(reversedS))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
