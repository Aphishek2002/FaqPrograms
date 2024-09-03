public class JusPrac1 {
    public static void main(String[] args) {
        int size = 10;
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for (int num : arr){
            if (size % num != 0){
                continue;
            }
            System.out.println(num);
        }
    }
}
