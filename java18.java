//Java program to find the sum of all the digits in the inputted number

import java.util.Scanner;

public class java18{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any digit number");
        int number = sc.nextInt();
        int sum = 0;
        while(number!=0){
            int reminder = number%10;
            sum = sum + reminder;
            number = number/10;
        }
        System.out.println("The sum of all the digits in the inputted number is  " + sum);
    }
}