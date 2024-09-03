import java.util.*;
public class NoOfDeleteion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();
        System.out.println(deletionNum(words));
    }

    public static int deletionNum(String s){
        int count = 0;

            for (int i =1;i < s.length(); i++){
                if (s.charAt(i) == s.charAt(i-1)){
                    count++;
                }
            }
        return count;
    }

}
