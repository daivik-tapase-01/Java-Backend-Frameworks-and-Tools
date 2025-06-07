import java.util.*;

public class Arrays2D {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // // 2D array
        // int rows = sc.nextInt();
        // int cols = sc.nextInt();
        // int numbers[][] = new int[rows][cols];
        // // Inputs
        // System.out.println("Enter elements: ");
        // for (int i = 0; i < rows; i++) {
        //     for (int j = 0; j < cols; j++) {
        //         numbers[i][j] = sc.nextInt();
        //     }
        // }
        // // Output
        // System.out.println("2D arrays: ");
        // for (int i = 0; i < rows; i++) {
        //     for (int j = 0; j < cols; j++) {
        //         System.out.print(numbers[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // // take a matrix as input from the user and search x and give index of x.
        // int rows = sc.nextInt();
        // int cols = sc.nextInt();
        // int matrix[][] = new int[rows][cols];

        // // Input
        // System.out.println("Enter elements: ");
        // for (int i = 0; i < rows; i++) {
        //     for (int j = 0; j < cols; j++) {
        //         matrix[i][j] = sc.nextInt();
        //     }
        // }
        // // find x
        // System.out.print("Enter x to find: ");
        // int x = sc.nextInt();
        // for (int i = 0; i < rows; i++) {
        //     for (int j = 0; j < cols; j++) {
        //         if (matrix[i][j] == x) {
        //             System.out.println("x found at index: ( " + i + "," + j + " )");
        //         }
        //     }
        // }

        // For a given matrix of N x M, print its transpose.
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int matrix[][] = new int[rows][cols];

        // input
        System.out.println("enter elements: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // output
        System.out.println("the transpose is: ");
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
