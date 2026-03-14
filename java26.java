//Java Program to find the Square of the given number
import java.util.Scanner;

public class java26{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();

        int square = num * num;

        System.out.println("Square of " + num + " is " + square);
        sc.close();
    }
}