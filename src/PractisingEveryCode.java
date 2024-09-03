import java.awt.image.ImageProducer;
import java.util.*;

public class PractisingEveryCode {
    public static void main(String[] args) {
//        fibonacciSeries(20);
//        System.out.println();
//        perfectSquareSeries(10);
//        System.out.println();
//        System.out.print(isPerfectSquare(25));
//        System.out.println();
//        System.out.println(isPerfectNumber(25));
//        System.out.println(isArmstrong(153));
//        System.out.println(isAnagram("listen","silent"));
//        int[] arr1 ={1,2,3,4,5,6,7};
//        int[] arr2 ={5,6,7,1,2,3,4};
//        System.out.println(maximumSubArraySum(arr2));
//        System.out.println(isRotatedArrays(arr1,arr2));
//        int[] nums = {16,17,4,5,2};
//        System.out.println(leaderValues(nums));
        int[] nums = {5, 10, 20, 15};
        System.out.println(greatestOfNeighbour(nums));
    }


    public static void fibonacciSeries(int size){
        int num1 = 0;
        int num2 = num1 +1;
        int sum = 0;
        for (int i = 0; i < size; i++){
            System.out.print( num1 + " ");
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }

    public static void perfectSquareSeries(int size){
        for (int i =0 ; i < size; i++){
            System.out.print(i*i + " ");
        }
    }

    public static boolean isPerfectSquare(int num){
        if (num > 0){
          int sr = (int) Math.sqrt(num);
          return ((sr * sr) == num);
        }
        return false;
    }

    public static boolean isPerfectNumber(int num){

        if (num > 0){
            int sum = 0;
            for (int i = 1; i < num; i++){
                if (num % i == 0){
                    sum += i;
                }
            }
            return (sum == num);
        }
        return false;
    }

    public static boolean isArmstrong(int num){
        double sum = 0;
        int res = 0;
        int remainder;
        int originalNum = num;
        while (originalNum != 0){
            originalNum = originalNum / 10;
            ++res;
        }

        while (originalNum != 0){
            remainder = originalNum % 10;
            sum += Math.pow(remainder,res);
            originalNum /= 10;
        }
        if (num == sum)
            return true;
        return false;
    }

    public static boolean isHarshadNumber(int num){


        return false;
    }

    public static boolean isAnagram(String str1, String str2){

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if (ch1.length != ch2.length){
            return false;
        }

        for (int i = 0; i < ch1.length; i++){
            if (ch1[i] == ch2[i])
                return true;
        }

        return false;
    }

    public static void pairInArray(int[] arr1, int sum){
        for (int i = 0; i < arr1.length; i++){
            for (int j = 1; j < arr1.length; j++){
                if (arr1[i] + arr1[j] == sum){
                    System.out.println("Pair in array for sum : " + arr1[i] + " " + arr1[j]);
                    break;
                }
                else {
                    continue;
                }
            }
        }
    }

    public static List<List<String>> groupAnagram(String[] strs){
        return new ArrayList<>();
    }

    public static Integer mostFrequentNumber(int[] thisArray){
        Integer maxCount = 0;
        Integer maxItem = null;
        Map<Integer,Integer> hashTable = new HashMap<>();
        for (int i : thisArray){
            if (hashTable.containsKey(i)){
                Integer newVal = hashTable.get(i) + 1;
                hashTable.put(i,newVal);
            }else {
                hashTable.put(i,1);
            }
            if (hashTable.get(i) > maxCount){
                maxCount = hashTable.get(i);
                maxItem = i;
            }
        }
        return maxItem;
    }

    public static Integer[] commonElements(int[] array1, int[] array2) {
        Integer[] resultInArray = new Integer[array2.length];
        for (int i = 0; i < array1.length; i++){
            for (int j = 0; j < array2.length; j++){
                if (array1[i] == array2[j]){
                    resultInArray[j] = array1[i];
                }
            }
        }
        return resultInArray;
    }

    public static boolean isBalancedParenthesis(String str){
        Stack<Character> stack1  = new Stack<>();
        for (int i=0; i < str.length();i++){
            if (str.charAt(i) == '{' || str.charAt(i) == '(' || str.charAt(i) == '['){
                stack1.add(str.charAt(i));
            } else if (str.charAt(i) == '}'|| str.charAt(i) == ')' || str.charAt(i) == ']') {
                if (stack1.isEmpty()){
                    return false;
                }
            } else if (str.charAt(i) == ')' && stack1.peek() == '(' ||
                    str.charAt(i) == '}' && stack1.peek() == '{' ||
                    str.charAt(i) == ']' && stack1.peek() == '[') {
                return false;
            }
            stack1.pop();
        }
        return stack1.isEmpty();
    }

    public static boolean isWhetherBalancedParenthesis(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '{' || ch == '(' || ch == '[') {
                stack.push(ch);
            } else if (ch == '}' || ch == ')' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                } else if (ch == '}' && stack.peek() != '{' ||
                        ch == ')' && stack.peek() != '(' ||
                        ch == ']' && stack.peek() != '[') {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static List<Integer> CommonElementInSortedArray(int[] arr1, int[] arr2) {
        List<Integer> resultSet = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                resultSet.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return resultSet;
    }

    public static boolean isRotatedArrays(int[] a,int[] b){
        if (a.length != b.length)
            return false;
        int key = a[0];
        int key_i = -1;
        int i;
        for ( i = 0; i < b.length; i++){
            if (b[i] == key ){
                key_i = i;
                break;
            }
        }
        if (key_i == -1)
            return false;
        for (i = 0; i < a.length; i++){
            int j = (key_i + i)% a.length;
            if (a[i] != b[j])
                return false;
        }
        return true;
    }

    public  static int maximumSubArraySum(int[] numArray){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int num : numArray){
            currentSum = Math.max(num,currentSum + num);
            maxSum = Math.max(maxSum,currentSum);
        }
        return maxSum;
    }

    public static List leaderValues(int[] arr){
        //arr = 16,17,4,5,2;
        int maxNum = 0;
        List<Integer> res = new ArrayList<>();
        for (int i = arr.length-1; i > 0; i--){
            if (arr[i] > maxNum)
                res.add(arr[i]);
            maxNum = arr[i];
        }
        return res;
    }

    public static List greatestOfNeighbour(int[] arr){
        //arr = {5, 10, 20, 15}
        List<Integer> res = new ArrayList<>();
        int neighbor = arr[0];
        for (int i = 1; i < arr.length - 1; i++){
            if (arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                res.add(arr[i]);
                neighbor = arr[i - 1];
            }
        }
        return res;
    }

}
