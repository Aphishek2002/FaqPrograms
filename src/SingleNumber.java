public class SingleNumber {
    public static void main(String[] args) {
        int[] input = {2,2,1};
        int res = input[0];
        for (int i = 1; i < input.length; i++) res ^= input[i];
        System.out.println(res);
    }
}
