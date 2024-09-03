public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10,40,20,50,30,70};
        int searchEle = 75;
        boolean flag = false;
        for (int i = 0; i<arr.length;i++){
            if (searchEle == arr[i]){
                System.out.println("Element found at : "+ i);
                flag = true;
                break;
            }
        }
        if (flag == false)
           System.out.println("Element Not found");
    }
}
