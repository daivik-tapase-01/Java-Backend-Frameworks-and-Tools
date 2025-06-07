import java.util.*;

public class Loops {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // // for loop
        // for (int i = 0; i < 5; i++) {
        // System.out.println(i + " Hello World!");
        // }

        // // while loop
        // int i = 0;
        // while (i < 5) {
        // System.out.println(i);
        // i++;
        // }

        // // do while loop
        // int i = 0;
        // do {
        // System.out.println(i);
        // i++;
        // } while (i < 7);

        // // sum of first n natural numbers
        // int n = sc.nextInt();
        // int sum = 0;
        // for (int i = 1; i <= n; i++) {
        // sum = sum + i;
        // }
        // System.out.println("sum of first n natural numbers is: " + sum);

        // print the table of a number input by the user.
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + i * n);
        }

        sc.close();
    }
}
