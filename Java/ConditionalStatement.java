import java.util.*;

public class ConditionalStatement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // int age = sc.nextInt();
        // if(age>18){
        //     System.out.println("Adult");
        // }else {
        //     System.out.println("Not Adult");
        // }

        // int num = sc.nextInt();
        // if (num % 2==0){
        //     System.out.println("Even");
        // }else{
        //     System.out.println("odd");
        // }

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // if(a==b){
        //     System.out.println("a is equal to b"); 
        // }else if(a>b){
        //     System.out.println("a is greater");
        // }else{
        //     System.out.println("a is smaller");
        // }
        

        // int button = sc.nextInt();
        // if (button == 1){
        //     System.out.println("Hello");
        // }else if(button == 2){
        //     System.out.println("Namaste");
        // }else if(button == 3){
        //     System.out.println("Bonjour");
        // }else{
        //     System.out.println("Invalid Button");
        // }

        
        // int button = sc.nextInt();
        // switch(button){
        //     case 1: System.out.println("Hello");
        //     break;

        //     case 2: System.out.println("Namesta");
        //     break;

        //     case 3: System.out.println("Bonjour");
        //     break;

        //     default: System.out.println("Invalid button");
        // }

        //Calculator 
        System.out.print("first number: ");
        int a = sc.nextInt();
        System.out.print("second number: ");
        int b = sc.nextInt();
        System.out.print("Operation 1-> +  2-> -  3-> *  4-> / : ");
        int operator = sc.nextInt();

        switch(operator){ 
            case 1: System.out.println("Sum:"+ (a+b));
            break;
            case 2: System.out.println("difference: "+( a-b));
            break;
            case 3: System.out.println("multiplication: "+ (a*b));
            break;
            case 4: System.out.println("division: "+ (a/b));
            break;
            default: System.out.println("Invalid Operator.");
        }
        sc.close();
    }
}