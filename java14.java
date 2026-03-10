//Java program which intakes 6 numbers as input and prints their average
import java.util.Scanner;

public class java14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Enter third number: ");
        int num3 = sc.nextInt();

        System.out.println("Enter fourth number: ");
        int num4 = sc.nextInt();

        System.out.println("Enter fifth number: ");
        int num5 = sc.nextInt();

        System.out.println("Enter sixth number: ");
        int num6 = sc.nextInt();

        System.out.println("Average of the six numbers is: " + (num1 + num2 + num3 + num4 + num5 + num6)/6);

        sc.close();
    }
}
