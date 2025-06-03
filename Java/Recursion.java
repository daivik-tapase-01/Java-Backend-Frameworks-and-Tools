package Java;

public class Recursion {

    // public static void printNumb(int n) {
    // if (n == 0) {
    // return;
    // }
    // System.out.println(n);
    // printNumb(n - 1);
    // }

    // public static void printAssen(int x) {
    // if (x == 6) {
    // return;
    // }
    // System.out.println(x);
    // printAssen(x + 1);
    // }

    // public static void sumNatural(int i, int n, int sum) {
    // if (i == n) {
    // sum += i;
    // System.out.println("sum :" + sum);
    // return;
    // }
    // sum += i;
    // sumNatural(i + 1, n, sum);
    // System.out.println(i);
    // }

    // // calculate factorial----------------
    // public static int calcfactorial(int n) {
    // if (n == 1 || n == 0) {
    // return 1;
    // }
    // int fact_nm1 = calcfactorial(n - 1);
    // int fact_n = n * fact_nm1;
    // return fact_n;
    // }

    // // fibonacci series --------------
    // public static void printFib(int a, int b, int n) {
    // if (n == 0) {
    // return;
    // }
    // int c = a + b;
    // System.out.print(c + " ");
    // printFib(b, c, n - 1);
    // }

    // // power calculation---------------
    // public static int calcPower(int x, int n) {
    // if (n == 0) {
    // return 1;
    // }
    // if (x == 0) {
    // return 0;
    // }
    // int xPownm1 = calcPower(x, n - 1);
    // int xPown = x * xPownm1;
    // return xPown;
    // }

    // calculate power by n/2 ------------
    public static int calcPowerDivide(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }

        if (n % 2 == 0) {
            return calcPowerDivide(x, n / 2) * calcPowerDivide(x, n / 2);
        } else {
            return calcPowerDivide(x, n / 2) * calcPowerDivide(x, n / 2) * x;
        }
    }

    public static void main(String[] args) {

        // int n = 5;
        // printNumb(n);

        // int x = 1;
        // printAssen(x);

        // int n = 2;
        // sumNatural(1, 5, 0);

        // // calculate factorial------------
        // int n = 5;
        // int ans = calcfactorial(n);
        // System.out.println(ans);

        // // fibonacci series --------------
        // int a = 0, b = 1;
        // System.out.print(a + " ");
        // System.out.print(b + " ");
        // int n = 7;
        // printFib(a, b, n - 2);

        // // power calculation---------------
        // int x = 2, n = 5;
        // int ans = calcPower(x, n);
        // System.out.println(ans);

        // calculate power by n/2 ------------
        int x = 3, n = 4;
        int result = calcPowerDivide(x, n);
        System.out.println(result);

    }
}