
//Java program to count the number of digits in the given number
import java.util.Scanner;

public class java33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sny digit number");
        int num = sc.nextInt();

        sc.close();
        int digitCount = 0;
        while (num > 0) {
            digitCount++;
            num = num / 10;
        }
        System.out.println("The number of digits in the given number is: " + digitCount);
    }
}