import java.util.*;
public class Array11111 {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqrst";
        StringBuilder result = new StringBuilder();
        //result should be apbqcr.

        for (int i = 0; i < word1.length()|| i < word2.length();i++){

            if (i < word1.length()){
                result.append(word1.charAt(i));
            }
            if (i < word2.length()){
                result.append(word2.charAt(i));
            }
        }
        System.out.println(result.toString());


    }
}
