public class Pattern3 {
    public static void main(String[] args) {
        pattern3(4);
    }

    static void pattern3(int num){
        for (int row = 1; row <= num; row++){
            for (int col = num; col >=  row; col--){
                System.out.print(" &");
            }
            System.out.println();
        }
    }
}
