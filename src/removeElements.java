import java.awt.image.ImageProducer;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class removeElements {
    public static int removeElements(int[] nums, int val) {
        int count = 0;
        for (int i =0; i < nums.length; i++){
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
//        int[] arr1 = {3,2,2,3};
//        System.out.println(removeElements(arr1,3));
//        String s = "xyxzy";
//        System.out.println(nonRepeating(s));
//        System.out.println(regExUsage("Red Light Blue Light","l"));
//        String[] names = {"abi","sri","pp","faaiz","abi","sri"};
//        System.out.println(uniqueName(names));
//        int[] numbers = {1,2,3,4,5,6,3,4,2,5};
//        int[] uniqueNumberss = rmoveDupli(numbers);
//        System.out.println(Arrays.toString(uniqueNumberss));
//        String ip1 = "192.168.11.0";
//        System.out.println(ip1 + " is valid? " + isValidIPAddress(ip1));
//        int[] addresses = {1, 2, 3, 2, 1, 5, 3, 1, 2, 1, 4, 5, 6};
//        int[] uniqueAddresses = processAddresses(addresses);
//        System.out.println(Arrays.toString(uniqueAddresses));
//        String[] words = {"ram","sam","som","kam","sam","ram"};
        String[] array1 = {"ram","sam"};
        String[] array2 = {"ram","kam"};

        HashSet<String> sortedWordsInArray2 = new HashSet<>();
        for(String word : array2){
            sortedWordsInArray2.add(sortedCharacters(word));
        }
        HashSet<String> anagramsMatched = new HashSet<>();
        ArrayList<String> result = new ArrayList<>();
        for (String word : array1) {
            if (sortedWordsInArray2.contains(sortedCharacters(word))) {
                if (!anagramsMatched.contains(word)) {
                    result.add(word);
                    anagramsMatched.add(word);
                }
            }
        }
        System.out.println(result);



    }

    public static char nonRepeating(String str){
        Map<Character,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if (hashMap.containsKey(c)){
                hashMap.put(c,hashMap.get(c) + 1);
            }  else {
                hashMap.put(c,1);
            }
        }
        for (int i =0; i < str.length(); i++){
            char c = str.charAt(i);
            if (hashMap.get(c) == 1 ){
                return c;
            }
        }
        return '\0';
    }

    public static int regExUsage(String sentence, String pattern){
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(sentence);
        int count = 0;
        while (m.find()){
            count++;
        }
        return count;
    }

    public static Set<String> uniqueName(String[] nameSet){
        Set<String> resultSet = new HashSet<>();
        for (int i = 0; i < nameSet.length; i++){
            resultSet.add(nameSet[i]);
        }
        return resultSet;
    }

    public static int[] rmoveDupli(int[] arr) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);  // Adds the number if it's not already present, thus ignoring duplicates
        }
        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;  // Each unique element is added to the result array, in the order they first appeared
        }
        return result;
    }

    public static boolean isValidIPAddress(String ip) {
        String[] parts = ip.split("\\.");
        if (parts.length != 4) {
            return false;
        }

        for (String part : parts) {
            if (!isValidPart(part)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isValidPart(String part) {
        try {
            int num = Integer.parseInt(part);
            return num >= 0 && num <= 255 && part.equals("" + num);
        } catch (NumberFormatException e) {
            return false;
        }
    }

    static int[] processAddresses(int[] addresses) {
        HashSet<Integer> set = new HashSet<>();
        for(int nums:addresses){
            set.add(nums);
        }
        // TODO: fill in the set

        int[] result = new int[set.size()];
        int i = 0;
        for (int num: set){
            result[i++] = num;
        }

        // TODO: fill in the result array

        return result;
    }

    public static String lastUniqueWord(String[] words){
        HashSet<String> wordSet = new HashSet<>();
        HashSet<String> duplicateSet = new HashSet<>();
        for(String word : words){
            if (wordSet.contains(word)){
                duplicateSet.add(word);
            } else{
                wordSet.add(word);
            }
        }
        System.out.println(wordSet);
        System.out.println(duplicateSet);
        wordSet.removeAll(duplicateSet);
        System.out.println(wordSet);
        String lastUniqueWord = "";
        for (int i = words.length - 1; i >= 0; i--){
            if (wordSet.contains(words[i])){
                lastUniqueWord = words[i];
            }
        }
        return lastUniqueWord;
    }

    public static String sortedCharacters(String input){
        char[] chars =  input.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

}
