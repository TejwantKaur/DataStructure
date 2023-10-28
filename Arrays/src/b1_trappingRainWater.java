public class b1_trappingRainWater {

    public static int trapWater(int[] arr){
        int n = arr.length;

        int[] leftMax = new int [n];
        leftMax[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            leftMax[i] = Math.max(leftMax[i-1],arr[i]);
        }

        int[] rightMax = new int [n];
        rightMax[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(rightMax[i+1],arr[i]);
        }

        int trappedWater=0; int width=1;
//        Waterlevel
        for(int i=0; i<arr.length; i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += (waterLevel - arr[i])*width;
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int[] ht = {4,2,0,6,3,2,5};
        int tw = trapWater(ht);

        System.out.println("Total Trapped Water is " + tw);
    }
}
