import java.util.*;

public class BitManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // // Get bit 
        // int n = 5;
        // int pos = 2;
        // int bitMask = 1<<pos;

        // if ((bitMask & n)== 0){
        //     System.out.println("bit was zero");
        // }else{
        //     System.out.println("bit was one");
        // }

        // // Set bit
        // int n = 5;
        // int pos = 1;
        // int bitMask = 1 << pos;

        // int newNumber = bitMask | n;
        // System.out.println(newNumber);

        // // Clear bit 
        // int n = 5;
        // int pos = 2;
        // int bitMask = 1 << pos;
        // int notBitMask = ~(bitMask);

        // int newNumber = notBitMask & n;
        // System.out.println(newNumber);

        //  Update bit
        // for 1 -> set : OR
        // for 0 -> clear : AND NOT
        int n = 5;
        int pos = 1;
        int oper = sc.nextInt();
        int bitMask = 1 << pos;

        if(oper == 1){
            // set
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }else{
            // clear
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }



        sc.close();
    }
}
