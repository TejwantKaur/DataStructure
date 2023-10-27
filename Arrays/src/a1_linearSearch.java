public class a1_linearSearch {
    public static int linearSearch(int nums[], int key){

        for(int i=0; i<nums.length; i++){
            if(nums[i]==key){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {2,5,13,67,43};
        int key1=13, key2=14;

        System.out.println(linearSearch(arr,key1));
        System.out.println(linearSearch(arr,key2));
    }
}
