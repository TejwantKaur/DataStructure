import java.util.*;
public class a3_menuActivity {
    public static int search(String arr[], String key){

        for(int i=0; i<arr.length; i++){
            if(arr[i].equals(key)){
                return i;
            }
        }

        return -1;
    }

    private static void getOrder(String[] menu) {

        System.out.println("Yur Menu Contains: ");
        print(menu);

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter order: ");
        String item = sc.next();

        System.out.println();
        int idx = search(menu,item);

        if(idx==-1){
            System.out.println("Invalid input\nTry again");
        }
        else{
            System.out.println("You ordered item["+idx+"] "+item+" ");

            switch (item) {
                case "Samosa" -> System.out.println("Yur payment is 10");
                case "Dosa" -> System.out.println("Yur payment is 60");
                case "Sandwich", "Burger" -> System.out.println("Yur payment is 50");
                case "Pasta" -> System.out.println("Yur payment is 120");
                case "Pizza" -> System.out.println("Yur payment is 350");
                case "Shake" -> System.out.println("Yur payment is 80");
                case "Coke" -> System.out.println("Yur payment is 40");
                default -> System.out.println("not an item");
            }

            System.out.println();
        }

    }
    private static void print(String[] arr){
        for(String item: arr){
            System.out.println(item);
        }
        System.out.println();
    }
    public static void main(String[] args) {

        String[] menu = {"Samosa" , "Dosa" , "Sandwich", "Burger", "Pasta", "Pizza", "Shake", "Coke"};
        getOrder(menu);

    }


}
