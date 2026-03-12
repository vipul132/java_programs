//Java program to print the Fibonacci series till the inputted number
import java.util.Scanner;

public class java23{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int number = sc.nextInt();
        int a =1;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");

        int f = 0;
        while(f<=number){
            f = a + b;
            if(f>number){
                break;
            }
            System.out.print(f+" ");
            a = b;
            b = f;
        }
        sc.close();
    }
}