public class BinarySearchLogic {
    public static void main(String[] args) {
        int[] a = {1,3,5,7,8,9,13,14,15,18,21,28,29};
        int l = 0;
        int h = a.length-1;
        int key = 15;
        boolean flag = false;
       while (l<=h){
           int m = (l+h)/2;
           if (a[m] == key){
               System.out.println("Element found at "+ m);
               flag = true;
               break;
           }
           if (a[m] > key){
               h = m-1;
           }
           if (a[m] < key){
               l = m+1;
           }

       }
       if (flag == false)
           System.out.println("Element not found");

    }
}
