package javabasics;

import java.util.*;

public class FunctionsPractice {

    // // average of three numbers
    // public static void calculateAverage(int a, int b, int c){
    // int avg = (a+b+c)/3;
    // System.out.println(avg);
    // }

    // // sum of all odd numbers from 1 to n
    // public static void calculateOddSum(int n) {
    // int sum = 0;
    // for (int i = 1; i <= n; i++) {
    // if (i % 2 != 0) {
    // sum = sum + i;
    // }
    // }
    // System.out.println(sum);
    // }

    // // greater of 2 numbers
    // public static void calculateGreater(int a, int b) {
    // if (a > b) {
    // System.out.println(a + " is greater");
    // } else {
    // System.out.println(b + " is greater");
    // }
    // }

    // // circumfernece of circle
    // public static void calculateCircumfernece(int r) {
    // System.out.println(2 * 3.14 * r);
    // }

    // // eligible to vote or not
    // public static void voteEligiblity(int age) {
    // if (age > 18 && age < 104) {
    // System.out.println("Eligible to vote");
    // } else if (age >= 0 && age < 18) {
    // System.out.println("Not Eligible to vote");
    // } else {
    // System.out.println("Invalid age.");
    // }
    // }

    // // infinte loop using do while -> use ctrl+c to stop
    // public static void infiniteLoop() {
    // do {
    // System.out.println("infinite loop");
    // } while (true);
    // }

    // // count of +ve , -ve and 0s
    // public static void calculateCount(Scanner sc) {
    // int pCount = 0, nCount = 0, oCount = 0;
    // int counter = 0;

    // while (counter == 0) {
    // System.out.println("press a-> add || any other letter-> result");
    // String choice = sc.next();

    // switch (choice) {
    // case "a":
    // System.out.println("give the number: ");
    // int n = sc.nextInt();
    // if (n > 0) {
    // pCount++;
    // } else if (n < 0) {
    // nCount++;
    // } else {
    // oCount++;
    // }
    // break;

    // default:
    // System.out.println("Postive count: " + pCount);
    // System.out.println("Negative count: " + nCount);
    // System.out.println("Zero count: " + oCount);
    // counter = 1;
    // }
    // }
    // }

    // // power finding
    // public static void calculatePower(int x, int n) {
    // double power = Math.pow(x, n);
    // System.out.println(power);
    // }

    // // greatest common divisor
    // public static void calculateGCD(int a, int b) {
    // while (b != 0) {
    // int temp = b;
    // b = a % b;
    // a = temp;
    // }
    // System.out.println(a);
    // }

    // // fibonacci series
    // public static void calculateFibonacci(int n) {
    // int first = 0, second = 1;
    // System.out.println("Fibonacci series up to " + n + " terms: ");

    // for (int i = 0; i < n; i++) {
    // System.out.print(first + " ");
    // int next = first + second;
    // first = second;
    // second = next;
    // }
    // }

    // fibonacci series using recursion
    public static int fibonacciRecursion(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // // average of three numbers
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // calculateAverage(a, b, c);

        // // sum of all odd numbers from 1 to n
        // int n = sc.nextInt();
        // calculateOddSum(n);

        // // greater of 2 numbers
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // calculateGreater(a, b);

        // // circumfernece of circle
        // int r = sc.nextInt();
        // calculateCircumfernece(r);

        // // eligible to vote or not
        // int age = sc.nextInt();
        // voteEligiblity(age);

        // // infinte loop using do while -> use ctrl+c to stop
        // infiniteLoop();

        // // count of +ve , -ve and 0s
        // calculateCount(sc);

        // // power finding
        // int x = sc.nextInt();
        // int n = sc.nextInt();
        // calculatePower(x, n);

        // // greatest common divisor
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // calculateGCD(a, b);

        // // fibonacci series
        // System.out.print("Enter the number of terms: ");
        // int n = sc.nextInt();
        // calculateFibonacci(n);

        // fibonacci series using recursion
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci series up to " + n + " terms: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursion(i) + " ");
        }

        sc.close();
    }
}
