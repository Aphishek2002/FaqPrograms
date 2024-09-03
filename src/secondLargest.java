public class secondLargest {
    public static void main(String[] args) {
        int[] a1 = {2,5,1,3,12,85,77};
        int max = a1[0];
        int smax = a1[1];
        for (int i = 2; i < a1.length; i++){
            if (a1[i] > smax){
                int temp = smax;
                smax = a1[i];
                a1[i] = temp;
                if (smax > max){
                    int tem = max;
                    max = smax;
                    smax = tem;
                }
            }
        }
        System.out.println(max);
        System.out.println(smax);
    }
}
