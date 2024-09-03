public class TwoPointer {
    public static void main(String[] args) {
        int[] arr = {1,2,5,6};
        int start = 0;
        int end = 0;
        while (end < arr.length){
            start++;
            end += 2;
        }
        System.out.println(start + " " + end);
    }
}
