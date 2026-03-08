//Finds Quotient and Reminder 
import java.util.Scanner;

public class java10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int firstNumber = sc.nextInt();
        System.out.println("Enter the second number");
        int secondNumber = sc.nextInt();

        int quotient = firstNumber / secondNumber;
        int remainder = firstNumber % secondNumber;

        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
        sc.close();
    }
    
}




// When one number is divided by another:

// Quotient → The result of the division

// Remainder → The leftover value after division

// Example:

// 10 ÷ 3

// Quotient = 3

// Remainder = 1