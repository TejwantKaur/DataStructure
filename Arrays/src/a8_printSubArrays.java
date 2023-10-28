public class a8_printSubArrays {

    public static void printSubarray(int[] arr){
        int n=arr.length;
        int totalPairs=0;

        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                }
                totalPairs++;
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("Total Pairs are: " + totalPairs);
    }


    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        printSubarray(arr);
    }
}
