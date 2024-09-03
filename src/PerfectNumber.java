public class PerfectNumber {
    public static void main(String[] args) {
        int oringinalNum = 6;
        int num = oringinalNum;
        int sumOfDivisors = 0;
        for (int i = 1; i < num ;i++){
            if (num % i == 0){
                sumOfDivisors += i;
            }
        }
        if(oringinalNum == sumOfDivisors)
            System.out.print(oringinalNum + " is a perfect number");
        else
            System.out.println(oringinalNum + " is not a perfect number");
    }
}
