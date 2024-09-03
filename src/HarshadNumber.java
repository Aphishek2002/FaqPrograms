public class HarshadNumber {
    public static void main(String[] args) {
        int num = 20;
        int originalNum = num;  // Store the original number
        int digit = 0;
        int sum = 0;

        while (num > 0) {
            digit = num % 10;
            sum += digit;
            num /= 10;
        }

        // Check if the original number is divisible by the sum of its digits
        if (originalNum % sum == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }
    }
}
