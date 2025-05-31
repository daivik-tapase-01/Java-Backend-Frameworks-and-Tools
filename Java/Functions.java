import java.util.*;

public class Functions {

    // public static void printName(String name) {
    // System.out.println(name);
    // return;
    // }


    // public static int calculateSum(int a, int b) {
    // int sum = a + b;
    // return sum;
    // }


    // public static int calculateProduct(int a, int b) {
    // return a * b;
    // }


    public static void calculateFactorial(int n) {
        if (n < 0) {
            System.out.println("Invalid Number");
            return;
        }
        if (n == 0 || n == 1) {
            System.out.println("factorial is: 1");
            return;
        }

        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println("factorial is: " + fact);
        return;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String name = sc.nextLine();
        // printName(name);


        // function to print sum of two numbres

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = calculateSum(a, b);
        // System.out.println("sum of " + a + " & " + b + " is " + sum);


        // function to multiply 2 numbers

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // System.out.println(calculateProduct(a, b));

        
        // function to find the factorial of a number

        int n = sc.nextInt();
        calculateFactorial(n);

    }
}
