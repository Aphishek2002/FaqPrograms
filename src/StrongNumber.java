public class StrongNumber {
    public static void main(String[] args) {
        int originalNum = 158;
        int num = originalNum;
        int i = 0;
        int count =0;
        int sum = 0;
        while(num > i){
            int digit = num % 10;
            int digitFactorial = 1;
            for (int j = 1;j <= digit;j++){
                digitFactorial =  digitFactorial * j;
            }
            sum = sum + digitFactorial;
            count++;
            num = num/10;
        }
        System.out.print(count);
        System.out.println();
        System.out.print(sum);
        System.out.println();

        if (originalNum == sum)
            System.out.println(originalNum  + " is a Strong Number");
        else
            System.out.println(originalNum  + " is not a Strong Number");
    }
}
