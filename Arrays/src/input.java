import java.util.*;
public class input {
    public static void main(String[] args) {
        int[] marks = new int [5];

        System.out.println("Length of array is " + marks.length);

        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("marks1="+marks[0]);
        System.out.println("marks2="+marks[1]);
        System.out.println("marks3="+marks[2]);

        marks[1] += 1;
        System.out.println("updated marks2="+marks[1]);

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("Percentage is " + percentage + "%");
    }
}
