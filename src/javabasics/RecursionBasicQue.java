package javabasics;

import java.util.HashSet;

public class RecursionBasicQue {

    // 1. Tower of Hanoi
    public static void towerOfHanoi(int n, String src, String helper, String dest){
        if(n == 1){
            System.out.println("transfer disk "+ n + " from "+ src + " to " + dest);
            return;
        }
        towerOfHanoi(n-1,src,dest,helper);

        System.out.println("transfer disk "+ n + " from "+ src + " to " + dest);

        towerOfHanoi(n-1,helper,src,dest);
    }

    // 2. print a string in reverse
    public static void printRev(String str, int idx){
        if(idx == 0) {
            System.out.print(str.charAt(idx)+" ");
            return;
        }
        System.out.print(str.charAt(idx)+ " ");
        printRev(str, idx -1);
    }

    // 3. find the occurrence of first and last element
    public static int first = -1;
    public static int last = -1;
    public static void findOccurrence(String str, int idx, char element){
        if(idx == str.length()){
            System.out.println("first occurrence: "+ first);
            System.out.println("last occurrence: "+ last);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == element){
            if(first == -1){
                first = idx;
            }else{
                last = idx;
            }
        }
        findOccurrence(str, idx+1, element);
    }

    // 4. check if the array is sorted(Strictly increasing)
    public static boolean isSorted(int[] arr, int idx){
        if(idx == arr.length-1){
            return true;
        }
        if(arr[idx] < arr[idx+1]){
            return isSorted(arr, idx+1);
        }else{
            return false;
        }
    }

    // 5. move all x to end of string
    public static void moveAllX(String str, int idx, int count, String newString){
        if(idx == str.length()){
            for(int i = 0; i < count; i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == 'x'){
            count++;
            moveAllX(str, idx+1, count, newString);
        }else{
            newString += currChar;
            moveAllX(str, idx+1, count, newString);
        }
    }

    // 6. Remove duplicates in a string
    public static boolean[] map = new boolean[26];
    public static void removeDuplicates(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        if(map[currChar-'a']){
        removeDuplicates(str,idx+1, newString);
        }else{
        newString += currChar;
        map[currChar-'a']=true;
        removeDuplicates(str, idx+1, newString);
        }
    }

    // 7. print all the subsequences of string
    public static void subsequences(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        // to be
        subsequences(str, idx+1, newString+currChar);

        // or not to be
        subsequences(str, idx+1, newString);
    }

    // 8. print all the unique subsequences of a string
    public static void uniqueSubsequences(String str, int idx, String newString, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = str.charAt(idx);

            // to be
        uniqueSubsequences(str, idx + 1, newString + currChar, set);
            // or not to be
        uniqueSubsequences(str, idx + 1, newString, set);

    }

    // 9. print keypad combination
    public static String[] keypad ={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printComb(String str, int idx, String combination){
        if(idx == str.length()){
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar-'0'];

        for(int i = 0; i < mapping.length(); i++){
            printComb(str, idx+1, combination+mapping.charAt(i));
        }
    }

    public static void main(String[] args) {

        // 1. Tower of Hanoi
        int n = 2;
        towerOfHanoi(n,"S","H","D");

        // 2. print a string in reverse
        String str2 = "abcd";
        printRev(str2,str2.length()-1);
        System.out.println();

        // 3. find the occurrence of first and last element
        String str4  = "avaacdaefaah";
        findOccurrence(str4,0,'a');

        // 4. check if the array is sorted(Strictly increasing)
        int[] arr = {1,2,3,4,5};
        System.out.println(isSorted(arr,0));

        // 5. move all x to end of string
        String str5 = "axbcxxd";
        moveAllX(str5, 0,0,"");

        // 6. Remove duplicates in a string
        String str6 = "abbccda";
        removeDuplicates(str6, 0,"");

        // 7. print all the subsequences of string
        String str7 = "abc";
        subsequences(str7, 0,"");

        // 8. print all the unique subsequences of a string
        String str8 = "aaa";
        HashSet<String> set = new HashSet<>();
        uniqueSubsequences(str8, 0, "",set);

        // 9. print keypad combination
        String str9 = "23";
        printComb(str9, 0, "");
    }
}
