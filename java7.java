
//the given year is a leap or not
import java.util.Scanner;

public class java7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");

        int year = sc.nextInt();
        boolean isLeapYear = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                } else {
                    isLeapYear = false;
                }
            } else {
                isLeapYear = true;
            }
        } else {
            isLeapYear = false;
        }

        if (isLeapYear) {
            System.out.println("Given year " + year + " is a leap year");
        } else {
            System.out.println("Given year " + year + " is not a leap year");
        }

        sc.close();
    }
}


// Leap Year Rules (Logic)

// A year is a leap year if:

// The year is divisible by 4
// But if the year is divisible by 100, it is NOT a leap year
// However, if the year is also divisible by 400, it IS a leap year