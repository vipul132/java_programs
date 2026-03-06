import java.util.Scanner;

//Sum of two numbers
public class java4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int num1 = sc.nextInt();

        System.out.println("Enter Second number");
        int num2 = sc.nextInt();

        System.out.println("The Sum of two numbers is: " + (num1 + num2));

        sc.close();
    }
}
