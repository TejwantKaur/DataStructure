public class a7_pairsInArray {

    public static void printPairs(int[] arr){  //O(n2)

        int totalPairs=0;
        for(int i=0; i<arr.length; i++){
            int curr = arr[i];

            for(int j=i+1; j<arr.length; j++){
                System.out.print("("+curr+","+arr[j]+")");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs are: " + totalPairs);
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        printPairs(arr);
    }
}
