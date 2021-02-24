
import java.util.Scanner;
/**
 * FirstProgram
 */
public class FirstProgram {
public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
      
        System.out.println("Enter string:");
        String myString = input.nextLine();
        System.out.println("Your entered: " + myString);

        
        System.out.println("Enter number:");
        int number = input.nextInt();
        System.out.println("Your number is:" + number);

        
        System.out.println("Enter float:");
        float myFloat=input.nextFloat();
        System.out.println("Your float is:" + myFloat);
        input.close();
        }
    
}

