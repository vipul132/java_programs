
//Find Power of a number
import java.util.Scanner;

public class java12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base number");
        double base = sc.nextDouble();
        System.out.println("Enter the exponent");
        double exponent = sc.nextDouble();

        System.out.println(base + " raised to the power " + exponent + " is " + (Math.pow(base, exponent)));
        sc.close();
    }
}
