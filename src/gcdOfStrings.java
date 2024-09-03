import java.util.*;
public class gcdOfStrings {
    public static void main(String[] args) {
        String str1 = "ABABABEHGFA";
        String str2 = "ABCEGQJ";
        String str3 = "";
        Set<Character> resultSet = new LinkedHashSet<>();
        char[] res = new char[str1.length()];
        char[] newArr = str1.toCharArray();
        char[] newArr2 = str2.toCharArray();
        for (int i = 0; i < newArr.length; i++){
            for (int j = 0; j < newArr2.length; j++){
                if (newArr[i] == newArr2[j]){
                    str3 += newArr[i];
                    resultSet.add(newArr[i]);
                }
            }
        }
        System.out.println(resultSet);
        System.out.println(str3);
    }
}
