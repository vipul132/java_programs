
//Java program which intakes width and height of a Rectangle and there by print its area
import java.util.Scanner;

public class java16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width of the rectangle: ");
        int width = sc.nextInt();
        System.out.println("Enter height of the rectangle: ");
        int height = sc.nextInt();
        System.out.println("Area of the rectangle is: " + (width * height));
        sc.close();
    }
}
