package javabasics;

import java.util.*;

public class Variables {
    public static void main(String[] args) {

        // String name = "Tony Starks";
        // int a = 25;
        // int b = 19;
        // int age = 20;
        // double price = 25.25;

        // int sum = a + b;
        // System.out.println(sum);

        // int diff = a - b;
        // System.out.println(diff);

        // // Input
        // Scanner sc = new Scanner(System.in);
        // String fullname = sc.nextLine();
        // System.out.println(fullname);

        //Sum two numbers
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);

        sc.close();
    }
}
