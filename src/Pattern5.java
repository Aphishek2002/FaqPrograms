public class Pattern5 {
    public static void main(String[] args) {
       // pattern5(5);
        pattern6(5);
        //pattern7(5);

    }

//    static void pattern7(int num){
//        for (int row = 1; row <= num;row++ ){
//
//            for (int space = 0; space <= num - row; space++){
//                System.out.print(" ");
//            }
//            for (int col = row; col >= 1; col--){
//                System.out.print(col);
//            }
//            for (int col = 2; col <= row; col++){
//                System.out.print(col);
//            }
//
//            System.out.println();
//        }
//
//    }
//
//    static void pattern5(int num){
//        for (int row = 1; row <= 2*num; row++){
//            int totNumOfColInRow = row > num ? 2*num - row : row ;
//            for (int col = 1; col <= totNumOfColInRow;col++){
//                System.out.print("*");
//                }
//            System.out.println();
//        }
////            for (int col = num +1;col <= num * 2;col)
//    }

    static void pattern6(int num){
        for (int row = 1; row <= 2*num; row++){
            int totNumOfColInRow = row > num ? 2*num - row : row ;

            int noOfSpaces = num - totNumOfColInRow;
            for (int sp = 1; sp <= noOfSpaces; sp++){
                System.out.print(" ");
            }
            for (int col = 1; col <= totNumOfColInRow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

