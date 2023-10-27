public class create {
    public static void main(String[] args) {
//        create
//        datatype arrayName[] = new datatype[size] --> fix size

        int[] marks = new int[50];

        for(int i=0; i<marks.length; i++){
            marks[i] = i+1;
        }

        for(int num: marks){
            System.out.print(num + " ");
        }

        System.out.println();
        int[] num = {1,2,3};
        for(int n : num){
            System.out.print(n + " ");
        }


        String[] fruits = {"apple", "mango", "litchi"};
        for(String fruit : fruits){
            System.out.print(fruit +" ");
        }
    }
}
