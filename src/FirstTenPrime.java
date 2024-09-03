public class FirstTenPrime {
    public static void main(String[] args) {
        int count = 0;
        int num = 2;

        System.out.println("First 10 Prime Numbers:");
        while (count < 10) {
            if (isPrime(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
    public static boolean isPrime(int no) {
        int count2 = 0;
        for (int i =1; i <= no; i++){
            if (no % i == 0){
                count2++;
            }
        }
        if (count2 == 2)
            return true;
        else
            return false;
    }
}