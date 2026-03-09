
//Find the perimeter of the circle
import java.util.Scanner;

public class java11{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double radius = sc.nextDouble();

        System.out.println("Perimeter of the circle is " + (2*Math.PI*radius) );
        sc.close();
    }
}
    