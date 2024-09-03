public class AutomorphicNumber {
    public static void main(String[] args) {
        int num  = 76;
        int squaredNum = num * num;
        boolean isAutomorphic = true;
        while(num != 0){
            if (num % 10 != squaredNum % 10){
                isAutomorphic = false;
                break;
            }
            num /= 10;
            squaredNum /= 10;
        }
        if(isAutomorphic)
            System.out.println("automorphic num");
        else
            System.out.println("Non automorphic num");
    }
}
