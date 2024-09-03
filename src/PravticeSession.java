public class PravticeSession {

    public static void main(String[] args) {
        System.out.println(isPrime(4));
        int upto = 20;
        for (int i = 1;i < upto; i++){
            if (isPrime(i))
                System.out.print(i + " ");
            else
                continue;
        }
    }
    public static  boolean isPrime(int num){
        int count = 0;
        for (int i = 1; i <= num; i++){
            if (num % i == 0){
                count++;
            }
        }
        if (count == 2)
            return true;
        return false;
    }
}
