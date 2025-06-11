package javabasics;

import java.util.ArrayList;

public class RecursionAdvanceQue {
    // print all permutations of a string
    public static void printPerm(String str, String permutation){
        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }
        for (int i =0; i<str.length(); i++){
            char currChar = str.charAt(i);
            // "abc" -> "ab"
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPerm(newStr, permutation + currChar);
        }
    }

    // count total paths in a maze to move from (0,0) to (n,m)
    public static int countPath(int i, int j, int n, int m){
        if(i == n || j == m){
            return 0;
        }
        if(i == n-1 && j == m-1){
            return 1;
        }
        // move downwards
        int downPath = countPath(i+1, j, n, m);

        // move right
        int rightPath = countPath(i, j+1, n, m);

        return downPath + rightPath;
    }

    // place tiles of size 1*m in a floor of size n*m
    public static int placeTiles(int n, int m){
        if(n == m){
            return 2;
        }
        if(n < m){
            return 1;
        }
        // vertically
        int vertPlaccements = placeTiles(n-m,m);

        // horizontally
        int horiPlacements = placeTiles(n-1,m);

        return vertPlaccements + horiPlacements;
    }

    // find the number of ways in which you can invite n people to your party, single or in pairs
    public static int callGuests(int n){
        if(n <= 1){
            return 1;
        }

        // single
        int ways1 = callGuests(n-1);

        // pairs
        int ways2 = (n-1) * callGuests(n-2);

        return ways1 + ways2;
    }

    // print all the subsets of a set of first n natural numbers
    public static void printSubset(ArrayList<Integer> subset){
        for(int i = 0; i < subset.size(); i++){
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }

    public static void findSubsets(int n, ArrayList<Integer> subset){
        if(n==0){
            printSubset(subset);
            return;
        }

        // add hoga
        subset.add(n);
        findSubsets(n-1,subset);

        // add nahi hoga
        subset.remove(subset.size()-1);
        findSubsets(n-1,subset);
    }

    public static void main(String[] args) {
        // print all permutations of a string
         String str1 = "abc";
         printPerm(str1,"");

        // count total paths in a maze to move from (0,0) to (n,m)
        int n1 = 3, m1 = 3;
        int totalPath = countPath(0,0,n1,m1);
        System.out.println(totalPath);

        // place tiles of size 1*m in a floor of size n*m
        int n2 = 4, m2 = 2;
        System.out.println(placeTiles(n2,m2));

        // find the number of ways in which you can invite n people to your party, single or in pairs
        int n3 = 4;
        System.out.println(callGuests(n3));

        // print all the subsets of a set of first n natural numbers
        int n4 = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubsets(n4, subset);
    }
}
