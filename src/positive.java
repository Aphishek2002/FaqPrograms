import java.util.Scanner;

public class positive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        int maxLength = 0;

        // Iterate over all possible starting points of the substring
        for (int i = 0; i < n; i++) {
            // Iterate over possible lengths of substrings
            for (int length = 2; length <= n - i; length += 2) {
                int sum1 = 0;
                int sum2 = 0;

                // Check sums of the two halves
                for (int k = 0; k < length / 2; k++) {
                    sum1 += Character.getNumericValue(s.charAt(i + k));
                    sum2 += Character.getNumericValue(s.charAt(i + k + length / 2));
                }

                if (sum1 == sum2) {
                    maxLength = Math.max(maxLength, length);
                }
            }
        }

        System.out.println(maxLength);
    }
}
