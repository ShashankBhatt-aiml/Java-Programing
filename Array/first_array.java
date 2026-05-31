package Array;

public class first_array {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 99;
        marks[1] = 100;
        marks[2] = 98;

        System.out.println("sub 1 :- " +marks[0]);
        System.out.println("sub 2 :- " +marks[1]);
        System.out.println("sub 3 :- " +marks[2]);

        // or using loops.

        for (int i = 0;i<=2;i++) {
            System.out.println(marks[i]);
        }
    }
}
