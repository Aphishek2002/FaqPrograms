import java.util.Arrays;
import java.util.Stack;

public class SecondSmallestElementInArray {
    public static void main(String[] args) {
//        int[] arr = {12,43,122,54,7,23,39};
//        int mid = (arr.length - 1)/2;
//       //Arrays.sort(arr);
//        System.out.println(arr[mid]);
        Stack<Character> st = new Stack<Character>();
        String str = "aphishek is kehsihpa";
        for(int i = 0; i < str.length(); i++){
            st.push(str.charAt(i));
        }
        char[] revString = new char[str.length()];
        int i = 0;
        while(!st.isEmpty()){
            revString[i++] = st.pop();
        }
        String acString = new String(revString);
        System.out.print(acString);
    }
}
