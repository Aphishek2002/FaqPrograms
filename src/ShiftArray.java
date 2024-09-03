public class ShiftArray {
    public static void main(String[] args) {
        int[] ipArray = {1,2,3,4,5,6,7};
        int shiftPosition = 2;
        int[] res = shiftArray(ipArray.length,ipArray,shiftPosition);
        System.out.println("Original Array: ");
        printArray(ipArray);
        System.out.println();
        System.out.println("Shifted array: ");
        printArray(res);
    }

    static int[] shiftArray(int ip1, int[] ip2, int ip3){
        int arr[] = new int[ip2.length];
        int j = 0,i = 0;
        for (i=ip3;i<ip2.length;i++){
            arr[j++] = ip2[i];
        }
        for (i = 0; i < ip3; i++){
            arr[j++] = ip2[i];
        }
        return arr;
    }

    static  void printArray(int[] arr){
        for (int num:arr){
            System.out.print(num + " ");
        }
    }
}
