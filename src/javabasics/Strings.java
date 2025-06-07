package javabasics;

import java.util.*;

public class Strings {
    public static void main(String aggs[]) {
        Scanner sc = new Scanner(System.in);

        // // string declaration
        // String name = "Daivik";
        // String fullName = "Daivik Tapse";

        // System.out.println("What would you like to eat: ");
        // String food = sc.nextLine();
        // System.out.println("your order is: " + food);

        // // concatenation
        // String firstName = sc.next();
        // String lastName = sc.next();
        // String fullName = firstName + " " + lastName;
        // System.out.println(fullName);

        // // length of String .length()
        // System.out.println(fullName.length());

        // // charAt()
        // for (int i = 0; i < fullName.length(); i++) {
        // System.out.println(fullName.charAt(i));
        // }

        // // .compareTo()
        // String name1 = "Tony";
        // String name2 = "Tony";

        // if (name1.compareTo(name2) == 0) {
        // System.out.println("Strings are equal.");
        // } else if (name1.compareTo(name2) > 0) {
        // System.out.println("name1 is Greater than name2.");
        // } else if (name1.compareTo(name2) < 0) {
        // System.out.println("name1 is Smaller than name2.");
        // }

        // // .substring()
        // String sentence = "My name is daivik";
        // String name = sentence.substring(11, sentence.length());
        // System.out.println(name);

        // // parseInt() -> string to number
        // String str = "123";
        // int number = Integer.parseInt(str);
        // System.out.println(number);

        // // toString() -> number to string
        // int number = 123;
        // String str = Integer.toString(number);
        // System.out.println(str);
        // System.out.println(str.length());

        // // Qu. take an array of string input and find the cumulative length of all
        // the strings
        // System.out.println("enter size of array: ");
        // int size = sc.nextInt();
        // String array[] = new String[size];
        // int totalLength = 0;
        // // input
        // System.out.println("enter " + size + " strings: ");
        // for (int i = 0; i < size; i++) {
        // array[i] = sc.next();
        // totalLength += array[i].length();
        // }
        // System.out.println(totalLength);

        // // Qu. replace letter 'e' with 'i'
        // System.out.println("enter an string: ");
        // String str = sc.nextLine();
        // String result = "";

        // for (int i = 0; i < str.length(); i++) {
        // if (str.charAt(i) == 'e') {
        // result += 'i';
        // } else {
        // result += str.charAt(i);
        // }
        // }
        // System.out.println("result: " + result);

        // Qu. create an username from email delete the part which comes after '@'
        System.out.println("enter your email: ");
        String email = sc.next();
        String userName = "";

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                break;
            } else {
                userName += email.charAt(i);
            }
        }
        System.out.println("username: " + userName);

        sc.close();
    }
}
