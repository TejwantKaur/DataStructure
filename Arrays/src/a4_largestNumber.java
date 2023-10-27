public class a4_largestNumber {
    private static int findLargest(int[] arr) {
        int largest=Integer.MIN_VALUE;

        for(int num:arr){
            if(num>largest){
                largest=num;
            }
        }
        return largest;
    }
    private static int findSmallest(int[] arr) {
        int Smallest=Integer.MAX_VALUE;

        for(int num:arr){
            if(num<Smallest){
                Smallest=num;
            }
        }
        return Smallest;
    }
    public static void main(String[] args) {
        int[] arr = {3,6,8,12,89,13,4,1};
        System.out.println("Largest value is: "+ findLargest(arr));
        System.out.println("Smallest value is: "+ findSmallest(arr));
    }
}
