public class a2_activity {

    public static int find(String arr[], String key){

        for(int i=0; i<arr.length; i++){
            if(arr[i].equals(key)){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String[] menu = {"samosa", "pasta", "dosa"};
        String key = "pasta";
        String key2 = "dosa";

        System.out.println(find(menu,key));
        System.out.println(find(menu,key2));

    }
}
