import java.rmi.MarshalException;

public class a9_maxSumSubArray {

//    subArray d jgeh hun sum of subArray print kravage
    public static void maxSubarray(int[] arr){
        int n=arr.length;

        int maxSum = Integer.MIN_VALUE;
        int currSum=0;

        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                currSum=0;
                for(int k=i; k<=j; k++){
                    currSum += arr[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("MaxSum is: " + maxSum);
    }

    public static void prefixSum(int[] arr){
        int n=arr.length;

        int currSum=0;
        int maxSum=Integer.MIN_VALUE;

        int prefix[] = new  int[arr.length];
        prefix[0] = arr[0];

//        prefix array
        for(int i=1; i<arr.length; i++){
            prefix[i] = prefix[i-1]+arr[i];
        }

        for(int i=0; i<n; i++){
            int start = i;
            for(int j=i; j<n; j++){
                int end = j;

//                start=0 i.e start-1 == -1 , which is incorrect
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

                if (maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("MaxSum is " + maxSum);
    }

    public static int kadanes(int[] arr){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            currSum += arr[i];
            if(currSum < 0){
                currSum=0;
            }
            maxSum = Math.max(currSum,maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        maxSubarray(arr);

        int[] numbers = {1,-2,6,-1,3};
        maxSubarray(numbers);
        prefixSum(numbers);

        int[] nums = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println(kadanes(nums));
    }
}
