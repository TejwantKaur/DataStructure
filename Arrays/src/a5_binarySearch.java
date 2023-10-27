public class a5_binarySearch {

    private static int binarySearch(int[] arr, int key){

        int start=0, end=arr.length-1;

        while(start<=end){
            int midIdx = (start+end)/2;

            if(arr[midIdx] == key){
                return midIdx;
            }
            else if(arr[midIdx]>key){
                end = midIdx-1;
            }
            else{
                start = midIdx+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] sortedArr = {1,4,6,8,12,14,16,24,35};
        int key = 8;
        int key2 = -8;

        int idx=binarySearch(sortedArr,key);
        if(idx == -1){
            System.out.println("Not Found");
        }else{
            System.out.println("Idx of key:"+key+ " is "+idx);
        }

        int idx2=binarySearch(sortedArr,key2);
        if(idx2 == -1){
            System.out.println("Not Found");
        }else{
            System.out.println("Idx of key:"+key+ " is "+idx2);
        }

    }
}
