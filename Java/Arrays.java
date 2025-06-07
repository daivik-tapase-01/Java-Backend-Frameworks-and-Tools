import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int marks[] = {96, 85, 94};

        // int[] marks = new int[3];
        // marks[0] = 97; // phy
        // marks[1] = 95; // chem
        // marks[2] = 92; // maths
        // for (int i = 0; i < 3; i++) {
        // System.out.println(marks[i]);
        // }

        // int size = sc.nextInt();
        // int number[] = new int[size];
        // // Input
        // for (int i = 0; i < size; i++) {
        // number[i] = sc.nextInt();
        // }
        // // output
        // for (int i = 0; i < size; i++) {
        // System.out.println(number[i]);
        // }

        // // find the element in array
        // System.out.println("give the size of array: ");
        // int size = sc.nextInt();
        // int number[] = new int[size];

        // // input
        // System.out.println("Enter the elements of array: ");
        // for (int i = 0; i < size; i++) {
        // number[i] = sc.nextInt();
        // }

        // // element to find
        // System.out.println("write the element to find: ");
        // int x = sc.nextInt();

        // // output
        // for (int i = 0; i < number.length; i++) {
        // if (number[i] == x) {
        // System.out.println("x is found on index: " + i);
        // }
        // }

        // // take an array of names as input and print them on screen.
        // System.out.println("array size:");
        // int size = sc.nextInt();
        // String names[] = new String[size];

        // // input
        // System.out.println("enter names: ");
        // for (int i = 0; i < size; i++) {
        // names[i] = sc.next();
        // }
        // // output
        // for (int i = 0; i < names.length; i++) {
        // System.out.println("name " + (i + 1) + " is: " + names[i]);
        // }

        // // find maximum & minimum number in array of integers
        // System.out.print("array size: ");
        // int size = sc.nextInt();
        // int integers[] = new int[size];

        // // input
        // System.out.println("enter elements: ");
        // for (int i = 0; i < size; i++) {
        // integers[i] = sc.nextInt();
        // }

        // int min = Integer.MAX_VALUE;
        // int max = Integer.MIN_VALUE;

        // // finding loop
        // for (int i = 0; i < size; i++) {
        // if (integers[i] < min) {
        // min = integers[i];
        // }
        // if (integers[i] > max) {
        // max = integers[i];
        // }
        // }
        // // output
        // System.out.println("min: " + min);
        // System.out.println("max: " + max);


        // find if the array is in ascending order or not
        System.out.println("array size:");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // input
        System.out.println("enter elements: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        boolean isAscending = true;
        for (int i = 0; i < size - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                isAscending = false;
            }
        }
        
        // result
        if (isAscending) {
            System.out.println("the array is in ascending order.");
        } else {
            System.out.println("the array is not in ascending order");
        }

        sc.close();
    }
}
