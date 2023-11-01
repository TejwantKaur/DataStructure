public class a3_largestString {

    public static String find(String[] arr){
        String largest = arr[0];

        for(int i=1; i<arr.length; i++){
            if(largest.compareTo(arr[i]) < 0){
//                apple < mango
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        String[] fruits = {"apple", "mango", "grapes"};
        System.out.println(find(fruits));
    }
}
