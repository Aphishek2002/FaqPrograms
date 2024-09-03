public class Pattern4 {
    public static void main(String[] args) {
        patter4(4);
    }

    static void patter4(int num){
        for (int row = 1; row <= num; row++){
            for (int col = 1; col <=  row; col++){
                System.out.print( col+" ");
            }
            System.out.println();
        }
    }
}
