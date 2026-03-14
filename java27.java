//Java program to find the Cube of the given number
import java.util.Scanner;

public class java27{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();

        System.out.println("Cube of " + num + " is " + (num * num *num));
    }
}