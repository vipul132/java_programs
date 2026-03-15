//Java program to find the factorial of the given number
import java.util.Scanner;

public class java29{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        int fact = factorial(num);
        System.out.println("Factorial for the given number " + num + " is: " + fact);
    }

    public static int factorial(int n){
        if(n==0){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }
}