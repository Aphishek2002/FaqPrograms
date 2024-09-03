import java.util.*;
public class ArmstrongNumOrNot {
    public static void main(String[] args) {
        String str = "java is language";
//        char[] ch = str.toCharArray();
        Set<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++ ){
            set.add(str.charAt(i));
        }
        for (Character ch : set){
            System.out.print(ch);
        }
//        int num = 154;
//        int remainder ;
//        int digit = 0;
//        int originalNum = num;
//        double tot = 0;
//
//        while (originalNum != 0){
//            originalNum = originalNum /10;
//            ++digit;
//        }
//
//        originalNum = num;
//
//        while (originalNum != 0){
//            remainder = originalNum % 10;
//            tot += Math.pow(remainder,digit);
//            originalNum /= 10;
//        }
//
//        if (num == tot)
//            System.out.println("It is an armstrong no");
//        else
//            System.out.println("Not an armstrong no");
//        int num = 153;
//        int originalNum = num; // Store the original number
//        int count = 0;
//
//        // Calculate the number of digits
//        while (num > 0) {
//            count++;
//            num /= 10;
//        }
//
//        num = originalNum; // Reset num to the original number
//        int digit;
//        int sum = 0;
//
//        // Calculate the sum of the powers of the digits
//        while (num > 0) {
//            digit = num % 10;
//            sum += Math.pow(digit, count);
//            num /= 10;
//        }
//        System.out.print(sum);
    }
}
