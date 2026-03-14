//Java program to find whether the given number is an Armstrong number
import java.util.Scanner;

public class java28{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();

        int originalnumber = num;
        int cubenumber = 0;

        while(num>0){
            int reminder = num % 10;
            cubenumber = cubenumber + (reminder*reminder*reminder);
            num = num / 10;
        }

        if(originalnumber==cubenumber){
            System.out.println(originalnumber+ " is an Armstrong number ");
        }else{
            System.out.println(originalnumber+ " is not an Armstrong number ");
        }

    }
}



// Formula
// abc = a³ + b³ + c³

// Example:

// 153

// Calculation:

// 1³ + 5³ + 3³
// = 1 + 125 + 27
// = 153