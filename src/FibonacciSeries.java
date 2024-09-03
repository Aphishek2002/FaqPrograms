public class FibonacciSeries {
    public static void main(String[] args) {
        int num = 10;
        int a=0,b=1;
        int sum;
        for (int i = 0;i < num; i++){
            System.out.print(a + " ");
            sum = a + b;
            a = b;
            b = sum;
        }
    }

//    public static int numToFibonacciSeries(int number){
//        for (int i = 0;i < number; i++){
//            if (i == i+1)
//                i +=
//        }

}

