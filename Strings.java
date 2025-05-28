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
        //     System.out.println(fullName.charAt(i));
        // }

        // // .compareTo()
        // String name1 = "Tony";
        // String name2 = "Tony";

        // if (name1.compareTo(name2) == 0) {
        //     System.out.println("Strings are equal.");
        // } else if (name1.compareTo(name2) > 0) {
        //     System.out.println("name1 is Greater than name2.");
        // } else if (name1.compareTo(name2) < 0) {
        //     System.out.println("name1 is Smaller than name2.");
        // }

        // .substring()
        String sentence = "My name is daivik";
        String name = sentence.substring(11, sentence.length());
        System.out.println(name);

    }
}
