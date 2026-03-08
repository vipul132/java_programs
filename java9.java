
//Calculate the area of a circle
import java.util.Scanner;

public class java9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double radius = sc.nextDouble();

        System.out.println("Area of the circle is " + (Math.PI * radius * radius));

        sc.close();
    }
}


// Formula
// Area = π × r²

// Where:

// π (pi) ≈ 3.14159

// r = radius of the circle

// r² = radius × radius