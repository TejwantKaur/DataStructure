public class a6_reverseAnArray {

    private static void reverse(int[] arr){

        int start = 0, end = arr.length-1;

        while(start<end) // end==start is mid element, onu swap kern di lodh nhi
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args) {

        int[] arr = {1,4,6,8,12,14,16,24,35};
        reverse(arr);

        for(int n:arr){
            System.out.print(n+" ");
        }
        System.out.println();
    }
}
