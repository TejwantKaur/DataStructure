import java.util.*;
public class input {
    public static void main(String[] args) {
        int[] marks = new int [5];

        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("marks1="+marks[0]);
        System.out.println("marks2="+marks[1]);
        System.out.println("marks3="+marks[2]);
    }
}
