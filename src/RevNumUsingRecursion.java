public class RevNumUsingRecursion {
    public static void main(String[] args) {
        int number = 987654321;
        System.out.println("original num: " + number);
        System.out.println("Reversed num: ");
        reverse(number);
    }

    public static void reverse(int num){
        if(num < 10){
            System.out.print(num);
            return ;
        }
        else{
            System.out.print(num % 10);
            reverse(num/10);
        }
    }
}
