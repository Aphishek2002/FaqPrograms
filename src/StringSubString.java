import java.util.*;
public class StringSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(subString(s1,s2));
    }

    public static String subString(String s1,String s2){
        String result = "No";
        int flag = 0;
//        char[] ch = ' ';
        for (int i =0; i < s1.length();i++){
            for (int j = 0; j < s2.length(); j++){
                if (s1.charAt(i) == s2.charAt(i)){
                    flag++;
                }
            }
        }
        if (flag == 0)
             result = "NO";
        else
            result = "Yes";
        return result;
    }

}
